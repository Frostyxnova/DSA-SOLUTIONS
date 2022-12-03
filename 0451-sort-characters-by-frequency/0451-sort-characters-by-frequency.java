class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>count= new HashMap<>();
        PriorityQueue<Character> maxHeap= new PriorityQueue<>((a,b)->count.get(b)-count.get(a));
        for(int i=0;i<s.length();i++)
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);   
        
        maxHeap.addAll(count.keySet());
        StringBuilder ans= new StringBuilder();

       while(!maxHeap.isEmpty()){
           Character current=maxHeap.poll();
            int r=count.get(current);
           while(r-->0){
               ans.append(current);
           }
       }

    return ans.toString();
        
    }
}


