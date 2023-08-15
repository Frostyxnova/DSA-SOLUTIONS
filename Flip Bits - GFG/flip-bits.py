#User function Template for python3

class Solution:
    def maxOnes(self, a, n):
        net_gain=0
        cur_sum=0
        count_ones=0
        for i in range(len(a)):
            if a[i]==0:
                cur_sum+=1
                net_gain=max(net_gain,cur_sum)
            elif a[i]==1:
                if cur_sum-1>0:
                    cur_sum-=1
                else:
                    cur_sum=0
                count_ones+=1
        return count_ones+net_gain


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob=Solution()
        print(ob.maxOnes(a, n))

        T -= 1


if __name__ == "__main__":
    main()



# } Driver Code Ends