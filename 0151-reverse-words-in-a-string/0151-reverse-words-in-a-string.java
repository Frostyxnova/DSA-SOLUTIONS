class Solution {
    public String reverseWords(String s) {
     if(s == null || s.length() == 0) {
            return "";
        }
        s = s.trim();
        String[] words = s.split(" ");
        String answer = "";
        for(int i = words.length - 1; i >= 0; i--) {
            String currentWord = words[i].trim();
            if(currentWord.length() > 0) {
                answer += currentWord + " ";
            }
        }
        return answer.trim();    
    }
}