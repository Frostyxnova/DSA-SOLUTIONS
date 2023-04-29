//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                a[i][0]=Integer.parseInt(s[0]);
                a[i][1]=Integer.parseInt(s[1]);
            }
            int k=Integer.parseInt(in.readLine().trim());
            Solution ob=new Solution();
            out.println(ob.powerfullInteger(n,a,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public static int powerfullInteger(int n,int in[][],int k)
    {
       int mx = 0;
    for(int i = 0; i < n; i++) {
        mx = Math.max(mx, in[i][1]);
    }

    int[] v = new int[mx + 2];
    for(int i = 0; i < n; i++) {
        v[in[i][0]]++;
        v[in[i][1] + 1]--;
    }

    int ans = -1;
    for(int i = 1; i < v.length; i++) {
        v[i] += v[i - 1];
        if(v[i] >= k) {
            ans = i;
        }
    }

    return ans;   
    }
}