class Solution {
    public int search(int[] nums, int target) {
        int piv = pivot(nums);

        if(piv == -1){
            return bSearch(nums, target, 0, nums.length - 1);
        }
        if(nums[piv] == target){
            return piv;
        }
        if(target >= nums[0]){
            return bSearch(nums, target, 0, piv-1);
        } 
        
        return bSearch(nums, target, piv+1, nums.length - 1);
    }

    
    int bSearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end -  start) / 2;

            if(end > mid && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(start < mid && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(nums[start] >= nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}