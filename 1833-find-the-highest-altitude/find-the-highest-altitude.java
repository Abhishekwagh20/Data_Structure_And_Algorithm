class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0;
        int max = 0;
        for(int i : gain){
            cur += i;
            max = Math.max(cur,max);
        }
        return max;
    }
}