//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static int addMinChar(String str){
	int n = str.length();
	int ans = 1;
	for(int j = n-1; j > 0; j--){
	    if(isPal(str,0,j)){
	        ans = j + 1;
	        break;
	    }
	}
	return n-ans;
	}
	private static boolean isPal(String str, int start, int end){
	    while(start < end){
	        if(str.charAt(start) != str.charAt(end)) return false;
	        start++;
	        end--;
	    }
	    return true;
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends