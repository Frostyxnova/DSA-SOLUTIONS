class Solution {
    int max = 0;
    public boolean check(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))) return false;
            hs.add(s.charAt(i));
        }
        max = Math.max(max,s.length());
        return true;
    }
    public void find(List<String> arr,String s,int idx){
        if(idx==arr.size()){
            return;
        }
        if(check(s+arr.get(idx))){
            find(arr,s+arr.get(idx),idx+1);
        }
        find(arr,s,idx+1);
        
    }
    public int maxLength(List<String> arr) {
        find(arr,"",0);
        return max; 
    }
}