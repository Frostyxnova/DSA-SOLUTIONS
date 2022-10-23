class Solution {
    public int[] findErrorNums(int[] nums) {
      int duplicate = 0;   // Duplicate value in the array
      int missing = 0;    // Missing value

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){   // finds the duplicate value in the array
            if(set.contains(i)) duplicate = i;
            set.add(i);
        }

        for(int i=1; i<=nums.length; i++){  // finds the missing value in the array
            if(set.contains(i) == false){
                missing = i;
                break;
            }
        }

        // returns an array which contains duplicate value and missing value
        return new int[]{duplicate, missing};      
    }
}