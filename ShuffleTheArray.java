package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<n;i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
        //--------------------------
        // int j = 0;
        // for(int i=0;i<nums.length;i=i+2){
        //     ans[i] = nums[j];
        //     ans[i+1] = nums[j+n];
        //     j++;
        // }
        // return ans;
        //--------------------------
    }
}
