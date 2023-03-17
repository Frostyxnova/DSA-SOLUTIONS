//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] arr = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i= 0; i < N; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution obj = new Solution();
			System.out.println(obj.no_of_subarrays(N, arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	long no_of_subarrays(int N, int [] arr) {
		long count = 0; // Initialize count of subarrays of 0's to 0
    long zeros = 0; // Initialize count of zeros to 0

    for (int i = 0; i < N; i++) {
        if (arr[i] == 0) {
            zeros++; // Increment count of zeros encountered so far
        } else {
            // Calculate the count of subarrays of 0's using the formula and 
            //add it to the overall count
            count += (zeros * (zeros + 1)) / 2; 
            zeros = 0; // Reset the count of zeros encountered so far
        }
    }
    // Add the count of subarrays of 0's that end at the last index separately
    count += (zeros * (zeros + 1)) / 2; 
    return count; // Return the total count of subarrays of 0's
}
}