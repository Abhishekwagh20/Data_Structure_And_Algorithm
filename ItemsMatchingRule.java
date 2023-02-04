package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.List;

public class ItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int rule = 0;
        if(ruleKey.equals("color")){
            rule = 1;
        }else if(ruleKey.equals("name")){
            rule = 2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(rule).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
