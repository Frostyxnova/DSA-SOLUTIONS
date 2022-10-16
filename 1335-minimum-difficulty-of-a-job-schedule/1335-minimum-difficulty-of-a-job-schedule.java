class Solution {
    public int minDifficulty(int[] arr, int d) {
      int dp[][]=new int[301][11]; // DP space
      for(int i[] : dp)Arrays.fill(i,-2);
        int result = solve(arr,d,0,dp);
        return result;    
    }
    
    public int solve(int[] arr,int d,int ind,int[][] dp){
        if((arr.length-ind) <  d)return -1;
        if(dp[ind][d] != -2)return dp[ind][d]; // DP
        if(d == 1){
            int min=Integer.MIN_VALUE;
            for(int i=ind;i<arr.length;i++)min=Math.max(min,arr[i]);
            return min;
        }
        int result = Integer.MAX_VALUE;
        int val=Integer.MIN_VALUE;
        for(int i=ind;i<=arr.length-d;i++){
            val=Math.max(val,arr[i]);
            int sum = val + solve(arr,d-1,i+1,dp);
            result=Math.min(result,sum);
        }
        return dp[ind][d]=result; // DP
    }
}