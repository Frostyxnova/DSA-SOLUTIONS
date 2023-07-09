//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {

    for(int i = 0; i < size; i++){
        int val = arr[i];
        if(val > 0 && val <= size){
            int idx = val -1;
            if(arr[idx] != val){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                i--;                          ;//again we are checking the swapped element is at correct position
            }
        }
    }
    for(int i=0;i<size;i++){
     if(i+1!=arr[i])return i+1;

//if the element is not at its corect position then that will be the missing number (i+1)
 }

//if all are at its correct position then next element of the last element will be the missing number

//like 1st input test case [1,2,3,4,5] , next element i.e 6 will be the output
 return size+1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends