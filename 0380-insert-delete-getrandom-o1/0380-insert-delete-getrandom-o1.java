class RandomizedSet {

   List<Integer> list; 
    HashMap<Integer, Integer> map; 
    // <val, index> 
    
    public RandomizedSet() {
        list = new ArrayList<>(); 
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false; 
        }
        map.put(val, list.size()); 
        list.add(val); 
        return true; 
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false; 
        }
        //if contains
        int index = map.get(val);
        int lastEle = list.get(list.size()-1); 
        list.set(index, lastEle); 
        map.put(lastEle, index);
        list.remove(list.size()-1);     
        map.remove(val);
        return true; 
    }
    
    public int getRandom() {
        // System.out.println(list.get(0)); 
        int randIndex = (int)(Math.random() * list.size()); 
        return list.get(randIndex); 
            
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */