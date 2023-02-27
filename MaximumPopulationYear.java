package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/maximum-population-year/
public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];

        for(int[] i: logs){
            ans[i[0] - 1950]++;
            ans[i[1] - 1950]--;
        }

        int max = ans[0];
        int maxVal = 1950;
        for(int i = 1; i < 101; i++){
            ans[i] += ans[i-1];
            if(max < ans[i]){
                max = ans[i];
                maxVal = i + 1950;
            }
        }
        return maxVal;
    }
}
