//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
    ArrayList<String> fn = new ArrayList<>();
        for (String x : Dictionary) {
            String ans = "";
            for (char i : x.toCharArray()) {
                if (Character.isUpperCase(i)) {
                    ans += i;
                }
                if (Pattern.equals(ans.substring(0, Math.min(Pattern.length(), ans.length())))) {
                    fn.add(x);
                    break;
                }
            }
        }
    if(fn.size() == 0){
        fn.add("-1");
        return fn;
    }
    Collections.sort(fn);
    return fn;
    }
}