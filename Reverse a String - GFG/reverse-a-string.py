#User function Template for python3

class Solution:
    def reverseWord(self, s):
        char_list = list(s)
        start = 0
        end = len(s) - 1
        while start < end:
            char_list[start], char_list[end] = char_list[end], char_list[start]
            start += 1
            end -= 1
        reversed_list = "".join(char_list)
        return reversed_list

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while(t>0):
        s = input()
        ob = Solution()
        print(ob.reverseWord(s))
        t = t-1

# } Driver Code Ends