class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<>();
        int[] ans = new int[index.length];
        for(int i = 0 ; i < index.length; i++){
            li.add(index[i],nums[i]);
        }

        for(int i = 0; i < li.size(); i++){
            ans[i] = li.get(i);
        }

        return ans;       
    }
}