//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
    int[] charCount = new int[26];
        Queue<Character> order = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (char c : A.toCharArray()) {
            int index = c - 'a';
            charCount[index]++;
            order.add(c);

            while (!order.isEmpty() && charCount[order.peek() - 'a'] > 1) {
                order.poll();
            }

            if (order.isEmpty()) {
                result.append('#');
            } else {
                result.append(order.peek());
            }
        }

        return result.toString();
    }
}