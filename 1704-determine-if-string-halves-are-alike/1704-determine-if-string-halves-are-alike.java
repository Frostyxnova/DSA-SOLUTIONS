class Solution {
 public boolean halvesAreAlike(String s) {
        int vowels = 0;
        int low = 0, high = s.length()-1;
        while(low < high){
            char ch1 = s.charAt(low);
            char ch2 = s.charAt(high);
            if(isVowel(ch1))
                ++vowels;
            if(isVowel(ch2))
                --vowels;
            low++;
            high--;
        }
        return vowels == 0;
 }
    
 private boolean isVowel(char c){
    return c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u' ||
           c == 'A' || c == 'E' || c =='I' || c == 'O' || c =='U';
    }
}