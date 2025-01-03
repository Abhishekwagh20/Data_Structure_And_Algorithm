class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer,Integer> map = new HashMap<>();
        // int[] ans = new int[2];

        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(target - nums[i])){
        //         ans[0] = i;
        //         ans[1] = map.get(target - nums[i]);
        //         break;
        //     } else {
        //         map.put(nums[i],i);
        //     }
        // }
        // return ans;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}