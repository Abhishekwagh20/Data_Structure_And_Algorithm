class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        return set.size() != nums.length;

        // for(int i = 0; i < nums.length - 1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}