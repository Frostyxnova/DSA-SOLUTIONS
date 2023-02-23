//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static final int mod=1000000007;
    static int uniquePaths(int n, int m, int[][] grid) {
    // If First Or Last Cell Is 0, Meaning We Can't Reach The Last Cell, So Return 0 Ways
    if(grid[0][0] == 0 || grid[n-1][m-1] == 0) return 0;    
    
    int dp[][] = new int[n+1][m+1];
    for(int[] temp:dp){
        Arrays.fill(temp,-1);
    }
    
    return (solve(0,0,n-1,m-1,grid,dp))%mod;
    }
    static int solve(int i, int j, int n, int m, int[][] arr, int dp[][]){
        // base case
        if(i > n || j > m || arr[i][j] == 0) return 0;
        // if we reach the last cell, we return 1 as in 1 way to reach last cell found
        if(i == n && j == m) return 1;
        
        if(dp[i][j] != -1) return (dp[i][j])%mod;
        
        dp[i][j] = (solve(i,j+1,n,m,arr,dp) + solve(i+1,j,n,m,arr,dp))%mod;
        
        return (dp[i][j])%mod;
    }
};