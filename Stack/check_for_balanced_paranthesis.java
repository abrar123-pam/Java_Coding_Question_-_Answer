package Stack;

import java.util.Scanner;
import java.util.Stack;

public class check_for_balanced_paranthesis {

    static class bal_paran{
        void Check_input(String s){
            Stack<Character> stack = new Stack<Character>();
            for (char it:s.toCharArray()) {
                if((it== '(')||(it=='[')|| (it=='{')){
                    stack.push(it);
                }else{
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty");
                    }
                    char p = stack.pop();
                    if((it == ')' && p == '(') || (it == ']' && p == '[') || (it == '}' && p == '{') ){
                        System.out.println("Valid");
                        continue;

                    }else {
                        System.out.println("Invalid String ");
                    }

                }
            }
        }

    }
    public static void main(String[] args) {
        String input;

        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();

        bal_paran b = new bal_paran();

        b.Check_input(input);


    }
}
