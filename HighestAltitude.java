package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i: gain){
            sum += i;
            max = Math.max(max,sum);
        }
        return max;
    }
}
