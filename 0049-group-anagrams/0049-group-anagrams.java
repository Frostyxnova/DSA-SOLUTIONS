class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            
            String astr= ascendingOrder(str);
            
            if(map.containsKey(astr)){
                List<String> list = map.get(astr);
                list.add(str);
                map.put(astr,list);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(astr,list);
            }
        }
       List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
    
    
    String ascendingOrder(String str)
    {
        char [] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}