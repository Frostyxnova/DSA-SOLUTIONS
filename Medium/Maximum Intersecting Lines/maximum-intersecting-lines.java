//{ Driver Code Starts
// Initial Template for Java
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int lines[][] = new int[(int)(N)][2];

            for (int j = 0; j < 2; j++) {
                String inputLine2[] = br.readLine().trim().split(" ");
                for (i = 0; i < N; i++) {
                    lines[i][j] = Integer.parseInt(inputLine2[i]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.maxIntersections(lines, N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxIntersections(int[][] lines, int N) {
    Map<Integer, Integer> mp = new TreeMap<>();
    for(int[] line: lines){
        mp.put(line[0], mp.getOrDefault(line[0],0) + 1);
        mp.put(line[1] + 1,mp.getOrDefault(line[1] + 1,0) - 1);
    }
    int prefixSum = 0, ans = -1;
    for(int i : mp.keySet()){
        prefixSum += mp.get(i);
        ans = Math.max(ans, prefixSum);
    }
    return ans;
    }
    
}
