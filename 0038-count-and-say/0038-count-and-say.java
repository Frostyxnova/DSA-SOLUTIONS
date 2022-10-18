class Solution {
    public String countAndSay(int n) {
 // For n=1, ans= "1".
        StringBuilder ans = new StringBuilder("1");
        // 'count' keeps track of 'n'
        int count = 1;

        while(count < n){
            // Get the countAndSay for current 'n' i.e. 'count' and store in the same 'ans', 
            // because we will use this 'ans' in the next iteration.
            ans = getCountAndSayUtil(ans.toString());
            count++;
        }

        return ans.toString();
    }

    StringBuilder getCountAndSayUtil(String s){
        int l = s.length();
        int i=0, j;
        StringBuilder ans = new StringBuilder();

        // Iterate on the string
        // 'i' keeps track of the first character of each substring
        while(i<l){
            int count = 1;
            // 'j' will traverse on the further string to check if jth character matches with ith character.
            j = i+1;
            // If they match, then do j++ & count++, where count stores the number of times the digit appears
            // in that substring
            while(j<l && s.charAt(i) == s.charAt(j)){
                j++;
                count++;
            }

            // Append the count and the character to the ans.
            ans.append(count);
            ans.append(s.charAt(i));

            // Move 'i' to the next substring
            i = j;
        }

        return ans;
    }
}