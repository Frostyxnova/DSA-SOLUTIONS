class Solution {
    public int maximum69Number (int num) {
      String nums= String.valueOf(num);
        char[] chars = nums.toCharArray();

        for(int i=0; i<chars.length; i++){
            if(chars[i]=='6'){
                chars[i]='9';
                break;
            }
        }

        return Integer.valueOf(String.valueOf(chars));    
    }
}
