class Solution {
    public int numIdenticalPairs(int[] nums) {
       int ct = 0;
       int[] temp = new int[101];

       for(int i : nums){
           ct += temp[i];
           temp[i]++;
       }

       return ct;
    }
}