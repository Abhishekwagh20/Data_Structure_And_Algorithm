package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.ArrayList;
import java.util.List;

public class TargetArrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
