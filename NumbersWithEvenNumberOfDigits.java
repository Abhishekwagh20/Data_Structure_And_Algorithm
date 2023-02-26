package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class NumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(countDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean countDigit(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return (count % 2 == 0);
    }
}
