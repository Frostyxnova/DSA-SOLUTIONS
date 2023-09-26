#User function Template for python3

# arr[] : int input array of integers
# k : the quadruple sum required
class Solution:
    def fourSum(self, A, K):
        A.sort()
        n = len(A)
        quadruples = []

        for i in range(n - 3):
            if i > 0 and A[i] == A[i - 1]:
                continue
            for j in range(i + 1, n - 2):
                if j != i + 1 and A[j] == A[j - 1]:
                    continue
                left, right = j + 1, n - 1
                while left < right:
                    total = A[i] + A[j] + A[left] + A[right]
                    if total == K:
                        quadruples.append([A[i], A[j], A[left], A[right]])
                        left += 1
                        right -= 1
                        while left < right and A[left] == A[left - 1]:
                            left += 1
                        while left < right and A[right] == A[right + 1]:
                            right -= 1
                    elif total < K:
                        left += 1
                    else:
                        right -= 1

        return quadruples



#{ 
 # Driver Code Starts
#Initial Template for Python 3


#Main
if __name__=='__main__':
    t = int(input())
    while t:
        t-=1
        n, k=map(int,input().split())
        # print(n, k)
        a=list(map(int,input().strip().split()))[:n]
        # print(a)
        ob=Solution()
        ans=ob.fourSum(a, k)
        # print(ans)
        for v in ans:
            for u in v:
                print(u, end=" ")
            print("$", end="")
        if(len(ans)==0):
            print(-1, end="")
        print()
        
        

# } Driver Code Ends