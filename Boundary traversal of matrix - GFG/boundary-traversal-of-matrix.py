#User function Template for python3

class Solution:
    def BoundaryTraversal(self, matrix, n, m):
        if n == 1:
            return matrix[0]

        if m == 1:
            return [matrix[i][0] for i in range(n)]

        return matrix[0] + [matrix[i][m - 1] for i in range(1, n)] + matrix[n - 1][m - 2::-1] + [matrix[i][0] for i in range(n - 2, 0, -1)]



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n,m = map(int, input().strip().split())
        values = list(map(int, input().strip().split()))
        k = 0
        matrix =[]
        for i in range(n):
            row=[]
            for j in range(m):
                row.append(values[k])
                k+=1
            matrix.append(row)
        obj = Solution()
        ans = obj.BoundaryTraversal(matrix,n,m)
        for i in ans:
            print(i,end=" ")
        print()

# } Driver Code Ends