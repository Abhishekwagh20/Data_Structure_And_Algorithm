package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        int l = num.length;
        for(int i = l-1; i >= 0; i--){
            int d = num[i] + c + (k%10);
            k /= 10;
            c = d / 10;
            list.add(d%10);
        }
        k += c;
        while(k > 0){
            list.add(k%10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
