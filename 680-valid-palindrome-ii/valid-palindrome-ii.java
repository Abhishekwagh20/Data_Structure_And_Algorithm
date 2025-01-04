class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);
    }

    public boolean isPalindrome(String s, int l, int r, boolean isDeleted){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                if(isDeleted){
                    return false;
                }

                return isPalindrome(s, l+1, r, true) || isPalindrome(s, l, r-1, true);
            }

            l++;
            r--;
        }
        return true;
    }
}