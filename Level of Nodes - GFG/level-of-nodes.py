#User function Template for python3
from collections import deque


class Solution:
    def nodeLevel(self, V, adj, X):
        q = deque()
        q.append((0, 0))
        vis = [0] * V
        vis[0] = 1

        while q:
            level, node = q.popleft()
            if node == X:
                return level
            for neighbor in adj[node]:
                if not vis[neighbor]:
                    vis[neighbor] = 1
                    q.append((level + 1, neighbor))

        return -1
                 
        
             
        
        
       


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