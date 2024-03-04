class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a,b);

        if(s.length()!= t.length()){
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        s = s.replace(" ","");
        t = t.replace(" ","");

        int[] frq = new int[26];

        for(int i = 0; i < s.length(); i++){
            frq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            frq[t.charAt(i) - 'a']--;
        }
        
        for(int i: frq){
            if(i != 0){
                return false;
            }
        }

        return true;
       
    }
}