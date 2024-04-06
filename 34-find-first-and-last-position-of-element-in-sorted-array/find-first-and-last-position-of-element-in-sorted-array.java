class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};
       ans[0] = check(nums, target, true);
       ans[1] = check(nums, target, false);
       return ans;
    }

    int check(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length - 1;
        int i = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                i = mid;
                if(left){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return i;
    }
}