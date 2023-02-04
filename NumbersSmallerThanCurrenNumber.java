package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class NumbersSmallerThanCurrenNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j =0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;

        // int n = nums.length;
        // int[] ans = new int[n];
        // int j = 0;
        // int min = Integer.MAX_VALUE;
        // while(j<n){
        //     min = nums[j];
        //     int count = 0;
        //     for(int i=0;i<n;i++){
        //         if(min > nums[i]){
        //             count++;
        //         }
        //     }
        //     ans[j] = count;
        //     j++;
        // }
        // return ans;
    }
}
