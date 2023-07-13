
from typing import List


class Solution:
    def isFrequencyUnique(self, n : int, arr : List[int]) -> bool:
        frequency_count = {}
        
        # Count the frequency of each element in the array
        for num in arr:
            if num in frequency_count:
                frequency_count[num] += 1
            else:
                frequency_count[num] = 1
        
        # Check if all frequencies are unique
        unique_frequencies = set(frequency_count.values())
        return len(unique_frequencies) == len(frequency_count)
        
       
        



#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        arr=IntArray().Input(n)
        
        obj = Solution()
        res = obj.isFrequencyUnique(n, arr)
        
        result_val = 1 if res else 0
        print(result_val)

# } Driver Code Ends