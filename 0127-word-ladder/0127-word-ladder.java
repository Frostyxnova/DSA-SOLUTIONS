class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words=new HashSet<>(wordList);
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        int count=1;
        q.add(beginWord); 
        
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                String cur = q.poll();
                if(cur.equals(endWord)){
                    return count;
                }
					for(int j=0;j<cur.length();j++){
                    char[] arr=cur.toCharArray();
                    for(char k='a';k<='z';k++){
                        arr[j]=k;
                        String newWord=new String(arr);
                        if(words.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }       
            }
            count++;            
        }
        return 0;         
    }
}