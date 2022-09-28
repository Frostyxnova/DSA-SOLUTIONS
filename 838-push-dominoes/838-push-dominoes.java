class Solution {
      // two pointers
    // "L...R" do nothing
    // "L..." do nothing
    // "R..." do nothing
    
    // "R...R" || "L...L", change every '.' to R or L
    // "R..." change all dots into R
    // "...L" change all dots into L
    
    // "R...L" check the number of '.' within the range, if odd, middle is still '.', otherwise, half R, half L
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int l = 0, n = arr.length;
        for(int r = 0; r < n; r++){
            if(arr[r] == '.') continue;
            else if(arr[r] == 'R' && (arr[l] == 'L' || arr[l] == '.')){ // "L..R" || "...R"
                // only update l
                l = r;
            } else if(arr[l] == arr[r] || (arr[r] == 'L' && arr[l] == '.')){ // "R..R", "L..L", "...L"
                // change all dots within the range
                for(int k = l; k < r; k++){
                    arr[k] = arr[r];
                }
                // update l
                l = r;
            } else if(arr[l] == 'R' && arr[r] == 'L'){ // "R...L"
                // calculate the number of dots within the range
                int amount = r - l - 1;
                // 3 / 2 == 1, 4 / 2 == 2
                int half = amount / 2;
                for(int k = 1; k <= half; k++){
                    arr[l + k] = 'R';
                    arr[r - k] = 'L';
                }
                // update l
                l = r;
            }
        }
        
        // "(..)R..."
        if(arr[l] == 'R'){
            for(int k = l + 1; k < n; k++){
                arr[k] = 'R';
            }
        }
        
        return new String(arr);
    }
}