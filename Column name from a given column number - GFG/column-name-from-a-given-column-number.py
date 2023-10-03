#User function Template for python3

class Solution:
    def colName (self, n):
        s = ""
        while n > 0:
            n -= 1
            c = chr((n % 26) + ord('A'))
            s = c + s
            n //= 26
        return s
            
     

#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int (input ())
for tc in range (t):
    n = int (input ())
    ob = Solution()
    print (ob.colName (n))
    

# } Driver Code Ends