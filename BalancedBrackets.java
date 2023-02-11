package Data_Structure_And_Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(check(st));

    }
    public static boolean check(String st){
        Stack<Character> stack = new Stack<>();

        for (int i=0 ;i < st.length();i++){
            char ch = st.charAt(i);
            if(ch == ')'){
                if(stack.peek()=='('){
                    return true;
                }else{
                    while (stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        return false;
    }
}
