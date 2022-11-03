class Solution {
    public int longestPalindrome(String[] words) {
     HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int ans=0;
        boolean central=false;
        for(String key:map.keySet()){
            StringBuilder key1=new StringBuilder(key);
            key1.reverse();
            String new_key=key1.toString();
            if(map.containsKey(new_key) && new_key.equals(key)==false){
                int min=Math.min(map.get(key),map.get(new_key));
                map.put(key,map.get(key)-min);
                map.put(new_key,map.get(new_key)-min);
                ans+=4*min;
            }
            else if(new_key.equals(key)==true){
                if(map.get(key)%2==0) {
                    ans+=map.get(key)*2;
                    map.put(key,0);
                }
                else{
                    ans+=(map.get(key)-1)*2;
                    map.put(key,1);
                    if(central==false){
                        ans+=2;
                        central=true;
                        map.put(key,0);
                    }
                    
                }
            }
        }
        return ans;    
    }
}