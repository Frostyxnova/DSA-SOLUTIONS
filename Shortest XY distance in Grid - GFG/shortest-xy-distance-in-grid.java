//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static class Pair{
        Integer first;
        Integer second;
        Pair(Integer x, Integer y){
            first = x;
            second = y;
        }
    }
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
       List<Pair> x_indices = new ArrayList<>();
       List<Pair> y_indices = new ArrayList<>();
       for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid.get(i).get(j) == 'X') {
                    x_indices.add(new Pair(i, j));
                } else if (grid.get(i).get(j) == 'Y') {
                    y_indices.add(new Pair(i, j));
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        
        for (Pair X : x_indices) {
            int Xi = X.first;
            int Xj = X.second;

            for (Pair Y : y_indices) {
                int Yi = Y.first;
                int Yj = Y.second;

                ans = Math.min(ans, Math.abs(Xi - Yi) + Math.abs(Xj - Yj));
            }
        }

        return ans;
    }
};