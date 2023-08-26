#User function Template for python3

class Solution:
    def longestKSubstr(self, s, k):
        if not s or k <= 0:
            return -1

        char_count = {}
        left = 0
        max_length = 0
        unique_count = 0

        for right in range(len(s)):
            c = s[right]
            char_count[c] = char_count.get(c, 0) + 1

            if char_count[c] == 1:
                unique_count += 1

            while unique_count > k:
                left_char = s[left]
                char_count[left_char] -= 1
                if char_count[left_char] == 0:
                    del char_count[left_char]
                    unique_count -= 1
                left += 1

            max_length = max(max_length, right - left + 1)

        return max_length if unique_count == k else -1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        s = input()
        k = int(input())

        solObj = Solution()

        ans = solObj.longestKSubstr(s, k)

        print(ans)

# } Driver Code Ends