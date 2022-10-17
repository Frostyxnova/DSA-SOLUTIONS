class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>(); 
      char[] str_array = sentence.toCharArray();
      for (char c : str_array){
         if (map.containsKey(c)){
            map.put(c, map.get(c) + 1);
         }else{
            map.put(c, 1);
         }
      }
          return map.size() == 26;
    }
}