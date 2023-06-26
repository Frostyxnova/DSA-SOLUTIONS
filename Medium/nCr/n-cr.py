#User function Template for python3

class Solution:
    def nCr(self, n, r):
        if(n < r):
            return 0
        elif(n == r):
            return 1
        else:
            mod = 10**9+7
            list = [0]*(n+1)
            list[0] = 1
            for i in range(1, n+1):
                list[i] = i*list[i-1]
            result = list[n] // (list[n-r]*list[r])
            return result%mod
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys
sys.setrecursionlimit(10**6)

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, r = [int(x) for x in input().split()]
        
        ob = Solution()
        print(ob.nCr(n, r))
# } Driver Code Ends