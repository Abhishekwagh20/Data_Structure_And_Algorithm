package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
// int n = nums.length;
// int sum = 0;
// int[] runningSum = new int[n];
// for(int i=0;i<n;i++){
//     sum = sum + nums[i];
//     runningSum[i] = sum;
// }
// return runningSum;

// for(int i=1;i<nums.length;i++){
//     nums[i] += nums[i-1];
// }
// return nums;
