//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
    String temp = "", ans = "";
    StringBuilder reversed = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    reversed.append(number.reverse());
                    number.setLength(0);
                }
                reversed.append(ch);
            }
        }

        if (number.length() > 0) {
            reversed.append(number.reverse());
        }

        return reversed.toString();
    }
}