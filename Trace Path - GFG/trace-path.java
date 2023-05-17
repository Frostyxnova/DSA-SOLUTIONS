//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
         int x = 0, y = 0, maxx = 0, minx = 0, maxy = 0, miny = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') x--;
            else if (c == 'R') x++;
            else if (c == 'U') y++;
            else if (c == 'D') y--;
            
            maxx = Math.max(maxx, x);
            maxy = Math.max(maxy, y);
            minx = Math.min(minx, x);
            miny = Math.min(miny, y);
        }
        if ((maxx - minx) < m && (maxy - miny) < n) return 1;
        
        return 0;
    }
}