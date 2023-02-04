package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
import java.util.ArrayList;
import java.util.List;

public class PangramSentence {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] a = alpha.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(i,a[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<list.size();j++){
                if(arr[i] == list.get(j)){
                    list.remove(j);
                }
            }
        }
        return list.isEmpty();
    }
}
