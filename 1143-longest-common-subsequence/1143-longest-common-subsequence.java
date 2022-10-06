class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int d[]:dp)Arrays.fill(d,-1);
        return longestCommonSubsequenceHelper(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
    public int longestCommonSubsequenceHelper(String text1,String text2,int i,int j,int dp[][]){
        if(i<0 || j< 0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)) return dp[i][j]=1+longestCommonSubsequenceHelper(text1,text2,i-1,j-1,dp);
        
        return dp[i][j]=Math.max(longestCommonSubsequenceHelper(text1,text2,i-1,j,dp),longestCommonSubsequenceHelper(text1,text2,i,j-1,dp));
            
    }
}