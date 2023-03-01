package Data_Structure_And_Algorithm;
// This is brute force methode will perform optimise methode later using hashmap
// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        return new int[]{a,b};
    }
}
