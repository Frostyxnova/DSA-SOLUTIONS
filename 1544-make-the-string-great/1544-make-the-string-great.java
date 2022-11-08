class Solution {
    public String makeGood(String s) {
    Stack<Character> st = new Stack<>();
    for(char ch: s.toCharArray()){
       if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32){
           st.pop();
       } 
        else{
            st.push(ch);
        }
    } 
    StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}

