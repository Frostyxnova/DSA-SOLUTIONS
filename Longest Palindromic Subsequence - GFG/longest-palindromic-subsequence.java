//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   int dp[][];
    public int longestPalinSubseq(String S)
    {
     int[][] dp=new int[S.length()][S.length()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        StringBuilder sb=new StringBuilder(S);
        
        return lcs(S, sb.reverse().toString(), 0, 0, dp);
        
    }
    int lcs(String s, String s1, int i, int j, int[][] dp){
        
        if(i >= s.length() || j >= s1.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s1.charAt(j)){
            return 1 + lcs(s, s1, i+1, j+1, dp);
        }
        else{
            return dp[i][j]= Math.max(lcs(s, s1, i+1, j, dp), lcs(s, s1, i, j+1, dp));
    }
}
}