package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class NumbersSmallerThanCurrenNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            min = nums[j];
            int count = 0;
            for(int i=0;i<n;i++){
                if(min > nums[i]){
                    count++;
                }
            }
            ans[j] = count;
            j++;
        }
        return ans;
    }
}
