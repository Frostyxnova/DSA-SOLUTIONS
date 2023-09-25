#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
from queue import PriorityQueue
class Solution:
    def maxCombinations(self, N, K, A, B):
        A.sort(reverse=True)
        B.sort(reverse=True)
        pq = PriorityQueue()
        ans = []
        if N == 0 or K == 0:
            return ans
        
        for i in range(min(N, K)):
            pq.put((-(A[i] + B[0]), i, 0))
            
        while K > 0 and not pq.empty():
            cur_sum, a_index, b_index = pq.get()
            ans.append(-cur_sum)
            
            b_index += 1
            if b_index < N:
                pq.put((-(A[a_index] + B[b_index]), a_index, b_index))
            K -= 1
            
        return ans
            
            

#{ 
 # Driver Code Starts.
if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        N, K = list(map(int, input().split()))
        A = list(map(int, input().split()))
        B = list(map(int, input().split()))
        ob = Solution()
        res = ob.maxCombinations(N, K, A, B)
        for val in res:
            print(val, end =' ')
        print()
# } Driver Code Ends