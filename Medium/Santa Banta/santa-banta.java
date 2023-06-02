//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    
   public static void precompute () {
        //Complete the function
    }
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int arr[][]) {
        //Complete the function
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        adj.add(new ArrayList<Integer>());
        for(int i=0;i<arr.length;i++){
            adj.get(arr[i][0]).add(arr[i][1]);
            adj.get(arr[i][1]).add(arr[i][0]);
        }
        boolean visited[]=new boolean[n+1];
        int prime=0;
        for(int i=1;i<=n;i++){
            int count[]=new int[1];
            if(!visited[i])
           dfs(count,adj,visited,i);
            prime=Math.max(prime,count[0]);
        }
      if(m==0)
        return -1;
          return kthPrime(prime);
    }
    static void dfs(int count[],List<List<Integer>> adj,boolean visited[],int node){
        visited[node]=true;
        count[0]++;
        for(int u:adj.get(node)){
            if(!visited[u])
            dfs(count,adj,visited,u);
        }
        
      
    }
     private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int kthPrime(int k) {
        int count = 0;
        int num = 2;
        while (count < k) {
            if (isPrime(num)) {
                count++;
            }
            if (count == k) {
                return num;
            }
            num++;
        }
        return -1; // This line should never be reached
    }
    
}