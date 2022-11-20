class Solution {
    int left=0;
    String s;
    public int calculate(String s) {
        this.s=s;
        return getResult();
    }
    
    private int getResult() {
        int total = 0, num = 0, sign = 1;
        while (left < s.length()) {
            char c = s.charAt(left++);
            if (c >= '0' && c <= '9') num = num * 10 + c - '0';
            else if (c == '(') num = getResult();
            else if (c == ')') return total + sign * num;
            else if (c == '+' || c == '-') {
                total += sign * num;
                num = 0;
                sign = c == '-' ? -1 : 1;
            }
        }
        return total + sign * num;
    }
}