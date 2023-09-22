#User function Template for python3


class Solution:
    def find(self, arr, n, x):
        def binary_search(arr, n, x, first_occurrence):
            left, right = 0, n - 1
            occurrence_idx = -1
            while left <= right:
                mid = left + (right - left) // 2
                if arr[mid] == x:
                    occurrence_idx = mid
                    if first_occurrence:
                        right = mid - 1
                    else:
                        left = mid + 1
                elif arr[mid] < x:
                    left = mid + 1
                else:
                    right = mid - 1
            return occurrence_idx
        first_occurrence = binary_search(arr, n, x, True)
        last_occurrence =  binary_search(arr, n, x, False)
        return (first_occurrence, last_occurrence)
        
      


#{ 
 # Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ob = Solution()
    ans=ob.find(arr,n,x)
    print(*ans)
# } Driver Code Ends