class Solution {
    public boolean checkSubarraySum(int[] nums, int n) {
     Set<Integer> modSet = new HashSet();
        int currSum = 0, prevSum=0;  
        for(int m : nums) {
            currSum += m;
            if(modSet.contains(currSum%n)) {
                return true;
            }
            currSum %=n;
            modSet.add(prevSum);
            prevSum = currSum;
        }
        return false;    
    }
}