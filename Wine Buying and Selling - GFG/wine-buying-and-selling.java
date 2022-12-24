//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int arr[],int N){
        // just do the prefix sum and add all the absolute values as this is the distance which we have to traverse to sell it or buy it.
           long ans=0;

        for(int i=1;i<N;i++)

        {

           ans+=Math.abs(arr[i-1]);

           arr[i]+=arr[i-1];

        }

        return ans;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends