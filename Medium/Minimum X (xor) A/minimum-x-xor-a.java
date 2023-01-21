//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
    int x=Integer.bitCount(a);
    int y=Integer.bitCount(b);
     int min=Integer.MAX_VALUE;

        if(x==y)
           return a;
        else if(x>y){
            for(int i=a;i>0;i--){
              //  min=Math.min(min,i^a);
                if(Integer.bitCount(i)==y)
                   return i;
            }
        }
        else if(y>x){
            for(int i=a;i<Integer.MAX_VALUE;i++){
             //  min=Math.min(min,i^b);
                if(Integer.bitCount(i)==y)
                   return i;
                
            }

        }

        return 0;
        
    }
}