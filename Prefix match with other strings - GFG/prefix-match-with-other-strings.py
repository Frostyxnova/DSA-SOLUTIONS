#User function Template for python3

class Solution:
    def klengthpref(self,arr,n,k,s):
        if len(s) < k:
            return 0
        str = s[:k]
        count = 0
        for i in range(n):
            if len(arr[i]) >= k and arr[i][:k] == str:
                count += 1
        
        return count
        # return list of words(str) found in the board


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == "__main__":
    t=int(input())
    for _ in range(t):
        n=int(input())
        arr = []
        for x in range(n):
            s1 = input()
            arr.append(s1)
        k = int(input())
        s = input()
        obj = Solution()
        print(obj.klengthpref(arr,n,k,s))
        
        
# } Driver Code Ends