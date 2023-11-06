class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            a.add(nums[i]);
        }

        for(int i = 0; i<=nums.length; i++){
            if(!a.contains(i)){
                return i;
            }
        }
        return -1;
    }
}