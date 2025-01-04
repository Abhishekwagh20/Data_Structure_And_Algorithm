class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder ans = new StringBuilder();
        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         ans.append(Character.toLowerCase(c));
        //     }
        // }

        // return ans.toString().equals(ans.reverse().toString());
        int start = 0;
        int last = s.length() - 1;

        while(start <= last){
            char fc = s.charAt(start);
            char lc = s.charAt(last);

            if(!Character.isLetterOrDigit(fc)){
                start++;
            } else if(!Character.isLetterOrDigit(lc)){
                last--;
            } else {
                if(Character.toLowerCase(fc) != Character.toLowerCase(lc)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}