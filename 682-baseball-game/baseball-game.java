class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                if(ans.size() > 0){
                    ans.pop();
                }
            } else if(operations[i].equals("D")){
                 if(ans.size() > 0){
                    int t = ans.peek();
                    ans.push(t*2);
                }
            }else if(operations[i].equals("+")){
                if(ans.size() > 1){
                    int a = ans.peek();
                    ans.pop();
                    int b = ans.peek();
                    ans.push(a);
                    ans.push(a+b);
                }
            }
            else{
                ans.push(Integer.parseInt(operations[i]));
            }

        }

        while(!ans.isEmpty()){
            sum += ans.pop();
        }
        return sum;
    }
}