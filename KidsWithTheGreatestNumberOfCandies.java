package Data_Structure_And_Algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i: candies){
            if(i> max){
                max = i;
            }
        }

        for(int i: candies){
            if(i+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
