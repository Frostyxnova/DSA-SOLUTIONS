
class Solution:
    def findMotherVertex(self, V, adj):
        vis = [False] * V
        mV = -1
        for i in range(V):
            if not vis[i]:
                self.dfs(adj, i, vis)
                mV = i
        
        vis = [False] * V
        self.dfs(adj, mV, vis)
        for val in vis:
            if not val:
                return -1
        
        return mV
    
    def dfs(self, adj, v, vis):
        vis[v] = True
        for it in adj[v]:
            if not vis[it]:
                self.dfs(adj, it, vis)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys 

sys.setrecursionlimit(10**6) 
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
		obj = Solution()
		ans = obj.findMotherVertex(V, adj)
		print(ans)
# } Driver Code Ends