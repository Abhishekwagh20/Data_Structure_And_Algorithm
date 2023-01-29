package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class SumOF1DArray {
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
