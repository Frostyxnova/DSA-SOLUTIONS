#User function Template for python3

class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,nums,n):
        #Your code here
        
        for i in range(n):
            if nums[i] < 1 or nums[i] > n:
                nums[i] = 0
                
        for i in range(n):
            if 1 <= nums[i] % (n + 1) <= n:
                ind = nums[i] % (n + 1) - 1
                nums[ind] += n + 1
          
        for i in range(n):
            if nums[i] <= n:
                return i + 1
        
        return n + 1

#{ 
 # Driver Code Starts
#Initial Template for Python 3


import math


def main():
        T=int(input())
        while(T>0):
            
            n=int(input())
            
            arr=[int(x) for x in input().strip().split()]
            
            ob=Solution()
            print(ob.missingNumber(arr,n))
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends