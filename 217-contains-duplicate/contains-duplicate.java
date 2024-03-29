class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }

        return false;

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