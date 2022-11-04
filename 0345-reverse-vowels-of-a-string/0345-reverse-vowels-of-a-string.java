class Solution {
    public String reverseVowels(String s) {
    Set<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length-1;
        
        while(start < end){
            while(start < end && !set.contains(arr[start])) start++;
            while(start < end && !set.contains(arr[end])) end--;
            
            swap(arr, start, end);
            start++;
            end--;
        }
        return new String(arr);
    }
    
 private void swap(char[] arr,int i,int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}