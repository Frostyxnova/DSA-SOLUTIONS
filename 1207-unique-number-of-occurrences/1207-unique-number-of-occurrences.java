class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       int arr1[]=new int[2001];
        HashSet<Integer> h=new HashSet<>();
        for(int i:arr){
            h.add(i);
            arr1[i+1000]++;
        }
        HashSet<Integer> h1=new HashSet<>();
        for(int i:h){
            if(!h1.contains(arr1[i+1000])){
                h1.add(arr1[i+1000]);
            }else{
                return false;
            }
        }
        return true;
        
    }
}