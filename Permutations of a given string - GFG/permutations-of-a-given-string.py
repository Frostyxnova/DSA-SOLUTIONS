#User function Template for python3

class Solution:
    def find_permutation(self, S):
        res = set()
        arr = list(S)
        self.recur(0,arr,res)
        sortedRes = sorted(list(res))
        return sortedRes
        
    def recur(self,index,arr,res):
        if index == len(arr):
            res.add("".join(arr))
            return
        for i in range(index,len(arr)):
            arr[index], arr[i] = arr[i], arr[index]
            self.recur(index + 1,arr,res)
            arr[i],arr[index] = arr[index], arr[i] #backtrack
       
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3


if __name__ == '__main__':
	t=int(input())
	for i in range(t):
		S=input()
		ob = Solution()
		ans = ob.find_permutation(S)
		for i in ans:
			print(i,end=" ")
		print()
# } Driver Code Ends