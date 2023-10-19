#User function Template for python3

class Solution:
    # Function to find the level of node X.
    def DFS(self, node, adj, target, level, vis):
        if node == target:
            return level
        vis[node] = 1
        for ch in adj[node]:
            if vis[ch] == 0:
                LEVEL = self.DFS(ch, adj, target, level + 1, vis)
                if LEVEL != -1:
                    return LEVEL
        vis[node] = 0
        return -1

    def nodeLevel(self, V, adj, X):
        vis = [0] * V
        return self.DFS(0, adj, X, 0, vis)
        
       


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        V,E = list(map(int, input().strip().split()))
        adj = [[] for i in range(V)]
        for i in range(E):
            a,b = map(int,input().strip().split())
            adj[a].append(b)
            adj[b].append(a)
        X=int(input())
        ob = Solution()
        
        print(ob.nodeLevel(V, adj, X))
# } Driver Code Ends