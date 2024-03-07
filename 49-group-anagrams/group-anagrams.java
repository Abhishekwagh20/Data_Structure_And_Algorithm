class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String st = new String(s);
            if(!map.containsKey(st)){
                map.put(st,  new ArrayList<>());
            }
            map.get(st).add(strs[i]);
        }
        return new ArrayList(map.values());



    }
}