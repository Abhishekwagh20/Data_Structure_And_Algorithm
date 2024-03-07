class Solution {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < s.length(); i++){
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i = 0; i < s.length(); i++){
        //     if(map.get(s.charAt(i)) == 1){
        //         return i;
        //     }
        // }
        // return -1;

        int[] frq = new int[26];
        for(char ch : s.toCharArray()){
            frq[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            if(frq[s.charAt(i) - 'a']==1){
                return i;
            }
        }
        return -1;
    }
}