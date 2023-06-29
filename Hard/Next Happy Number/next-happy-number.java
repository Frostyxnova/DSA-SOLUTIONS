//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int n){
           if(n==0)
        return 1;
        n++;
        while(!find(n))
        {
            n++;
        }
        
        return n;

    }
  static   Boolean find(int n)
    {
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum=sum+temp*temp;
            n=n/10;
            
        }
        if(sum==1||sum==7)
        return true;
        if(sum<=9)
        return false;
        return find(sum);
    }
}