class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ar = new boolean[26];
        for(int i = 0; i <  sentence.length(); i++){
            ar[sentence.charAt(i) - 97] = true;
        }

        for(int i = 0; i < 26; i++){
            if(ar[i] != true){
                return false;
            }
        }
        return true;

    }
}