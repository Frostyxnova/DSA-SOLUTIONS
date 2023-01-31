//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
      int ans=1;
      String s=A;
      while(s.length()<B.length()){
            s+=A;
            ans++;
        }

        if(isSubstring(B,s)) return ans;

        if(isSubstring(B,s+A)) return ans+1;

        return -1;
    }
    static boolean isSubstring(String B, String s){
      int bLength=B.length();

        int sLength=s.length();

        for(int i=0;i<=sLength-bLength;i++){

            int j=0;

            for(j=0;j<bLength;j++){

                if(s.charAt(i+j)!=B.charAt(j))

                break;
            }
               if(j==bLength)return true;
}
            return false;
     
    }
};