class Solution {
    public List<String> topKFrequent(String[] words, int k) {
   Map<String, Integer> map = new HashMap<>();
   List<String> res = new ArrayList<>();
   PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(new ElementComparator());
    
    for(String word : words){
        map.put(word, map.getOrDefault(word, 0) + 1);
    }
    
    for(Map.Entry<String, Integer> entry: map.entrySet()){
        maxHeap.offer(entry);
    }
    
    for(int i = 0; i < k; i++){
        res.add(maxHeap.poll().getKey());
    }
    
    return res;
}

class ElementComparator implements Comparator<Map.Entry<String, Integer>>{
    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
        if(e1.getValue() == e2.getValue()){
            return e1.getKey().compareTo(e2.getKey());
        }
        
        return e2.getValue() - e1.getValue();
    }
}
}    
    