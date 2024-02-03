class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> li = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i : candies){
            if(max < i){
                max = i;
            }
        }

        for(int i = 0;  i < candies.length; i++){
            if(candies[i]+extraCandies >= max){
                li.add(true);
            }else{
                li.add(false);
            }
        }
        return li;

    }
}