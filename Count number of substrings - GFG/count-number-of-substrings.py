#User function Template for python3

class Solution:
    def subAtMostK(self, s, k):
        cnt = distinct = start = 0
        d = dict()
        for i in range(len(s)):
            d[s[i]] = d.get(s[i], 0)
            d[s[i]] += 1
            #print(d)
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            cnt += i - start + 1
        return cnt
        
    def substrCount (self,s, k):
        return self.subAtMostK(s, k) - self.subAtMostK(s, k - 1)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int (input ())
for tc in range (t):
    s = input ()
    k = int (input ())
    ob = Solution()
    print (ob.substrCount (s, k))
# } Driver Code Ends