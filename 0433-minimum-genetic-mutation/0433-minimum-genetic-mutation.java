class Solution {
    public int minMutation(String start, String end, String[] bank) {
    if(start.equals(end)) return 0;
    Set<String> bankSet = new HashSet<>();
    for(String s: bank) bankSet.add(s);
        
        char[] gene = new char[]{'A','C','G','T'};
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        int step = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String cur = q.poll();
                if(cur.equals(end)) return step;
                
                char[] curArr = cur.toCharArray();
                for(int j = 0; j < curArr.length; j++){
                    char old = curArr[j];
                    for(char c: gene){
                        curArr[j] = c;
                        String newString = new String(curArr);
                        if(bankSet.contains(newString)){
                            q.offer(newString);
                            bankSet.remove(newString);
                        }
                    }
                    curArr[j] = old;
                }
            }
            step++;
        }
        return -1;
    }
}
