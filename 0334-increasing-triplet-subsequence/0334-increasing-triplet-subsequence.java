class Solution {
    public boolean increasingTriplet(int[] nums) {
    if(nums.length < 3) return false;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min1){
                min1 = nums[i];
            }
            else if(nums[i] > min1 && min2 > nums[i]){
              min2 = nums[i];
            }
            else if(nums[i] > min1 && nums[i] > min2){
              return true;
            }
        }
        return false;
    }
}