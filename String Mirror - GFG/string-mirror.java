//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
    StringBuilder s=new StringBuilder();
        s.append(str.charAt(0));
        
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)<str.charAt(i-1))
            s.append(str.charAt(i));
            else if(str.charAt(i)>str.charAt(i-1))
            break;
            else if(str.charAt(i)==s.charAt(0))
            break;
            else
            s.append(str.charAt(i));
        }
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        String res=s.toString()+rev.toString();
        return res;
    }
}
        
