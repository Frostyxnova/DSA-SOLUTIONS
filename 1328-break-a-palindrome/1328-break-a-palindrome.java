class Solution {
    public String breakPalindrome(String palindrome) {
    char[] Str = palindrome.toCharArray();
if(Str.length<2) return "";

    for(int i = 0;i<Str.length/2;i++) {
        if(Str[i]!='a') {
            Str[i] = 'a';
        return String.valueOf(Str);
        }
    }
   Str[Str.length-1] = 'b';
    return String.valueOf(Str);     
    }
}