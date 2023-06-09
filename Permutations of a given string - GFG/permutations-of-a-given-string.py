#User function Template for python3
from itertools import permutations
class Solution:
    def find_permutation(self, S):
        return sorted(set(''.join(p) for p in permutations(S)))



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