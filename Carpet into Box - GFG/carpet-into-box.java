//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
    int count = 0;
    while(Math.max(A,B) > Math.max(C,D) || Math.min(A,B) > Math.min(C,D)){
        if(Math.max(A,B) > Math.max(C,D)){
            if(A>B) A/=2;
            else B/=2;
        }
        else{
            if(A<B) A/=2;
            else B/=2;
        }
        count++;
    }
        return count;
    }
   
}
