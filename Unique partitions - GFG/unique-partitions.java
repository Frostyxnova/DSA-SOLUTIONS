//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends



//User function Template for Java

class Solution
{   ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        path(n,n,new ArrayList<Integer>());
        return ans;
    }
    
    void path(int sum, int i, ArrayList<Integer> temp){
        if(sum<=0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j = Math.min(sum,i); j>=1; j--){
            temp.add(j);
            path(sum-j,j,temp);
            temp.remove(temp.size()-1);
        }
    }
}