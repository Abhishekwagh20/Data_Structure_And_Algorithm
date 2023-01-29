package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] i: accounts){
            int sum = 0;
            for(int j: i){
                sum += j;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
