#User function Template for python3

class Solution:  
    
    #Function to find the maximum money the thief can get.
    def FindMaxSum(self,a, n):
        prev2 = 0
        prev = a[0] 
        
        for i in range(n):
            take = a[i]
            if i > 1:
                take += prev2
            not_take = prev
            cur_i = max(take, not_take)
            prev2 = prev
            prev = cur_i
            
        return prev
        
    

#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys
sys.setrecursionlimit(10**6)
# Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        n = int(input())
        a = list(map(int,input().strip().split()))
        ob=Solution()
        print(ob.FindMaxSum(a,n))
# } Driver Code Ends