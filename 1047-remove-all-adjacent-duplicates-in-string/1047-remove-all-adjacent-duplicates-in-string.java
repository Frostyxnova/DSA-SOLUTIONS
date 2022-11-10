class Solution {
    public String removeDuplicates(String s) {
    Stack<Character> st =  new Stack<>();
        for(char i:s.toCharArray()){
            if(!st.isEmpty() && st.peek() == i){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
