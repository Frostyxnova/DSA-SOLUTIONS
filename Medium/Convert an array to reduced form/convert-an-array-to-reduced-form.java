//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void convert(int[] arr, int n) {
    int temp[] = new int[n], ansB[] = new int[n], x = 0;
    
    // copying array
    for(int i = 0; i < n; i++) temp[i] = arr[i];
    Arrays.sort(temp);
    
    // search each element
    for(int i = 0; i < n; i++){
        x = binarySearch(temp,0,n-1,arr[i]);
        ansB[i] = x;
    }
    for(int i = 0; i < n; i++) arr[i] = ansB[i];
        
    }
    
    int binarySearch(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
           
            return  binarySearch(arr, mid + 1, r, x);
        }
 
      
        return -1;
    }
}