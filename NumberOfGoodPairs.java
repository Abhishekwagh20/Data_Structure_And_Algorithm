package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int[] count = new int[101];

        for(int i:nums){
            result += count[i];
            count[i]++;
        }
        return result;

        // int count = 0;
        // for(int i =0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}
