package Prefix_Infix_Postfix_Conversion_Problems;

import java.util.Stack;

public class infix_to_postfix {

    static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp){

        String result = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                result += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                stack.pop();
            }else {
                while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()){
            if (stack.peek() == '('){
                return  "Invalid Expression";
            }
            result += stack.pop();
        }

        return  result;
    }
    public static void main(String[] args) {
        String exp = "3^(1+1)";
        System.out.println("String is : " + exp );
        System.out.println("Infix to Postfix : "+infixToPostfix(exp));
    }
}
