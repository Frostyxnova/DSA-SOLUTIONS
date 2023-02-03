#User function Template for python3

class Solution:
    def endPoints(self, matrix, R, C):
        #code here
        i = 0
        j = 0
        
        direction = "r"
        direction_change = {"u":"r",
                            "r":"d",
                            "d":"l",
                            "l":"u"
                            }
        
        
        while i in range(0, R) and j in range(0, C):
            if matrix[i][j] == 1:
                
                matrix[i][j] = 0
                direction = direction_change[direction]
                
            if direction == "u":
                i -= 1
                
            elif direction == "r":
                j += 1
                
            elif direction == "d":
                i += 1
                
            elif direction == "l":
                j -= 1
                
        if i >= R:
            i = R - 1
        elif i < 0:
            i = 0
        
        if j >= C:
            j = C - 1
        elif j < 0:
            j = 0
            
        return (i, j)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        r,c = map(int, input().strip().split())
        matrix = []
        for i in range(r):
            line = [int(x) for x in input().strip().split()]
            matrix.append(line)
        ob = Solution()
        ans = ob.endPoints(matrix,r,c)
        print('(',ans[0],', ',ans[1],')',sep ='')

# } Driver Code Ends