class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(Character.toLowerCase(c));
            }
        }

        return ans.toString().equals(ans.reverse().toString());
    }
}