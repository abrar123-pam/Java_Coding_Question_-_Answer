package Stack;

import java.util.Stack;

public class postfix_to_infix {

    public static boolean isOperator(char ch){
        switch(ch){
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;

    }

    public static String postToInfix(String postfix) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<postfix.length();i++) {
            char c = postfix.charAt(i);

            if(isOperator(c)){
                String op1 = st.pop();
                String op2 = st.pop();

                String temp = "("+op2+c+op1+")";

                st.push(temp);
            }else{
                st.push(c+"");
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "23*5+";
        String infix = postfix_to_infix.postToInfix(postfix);
        System.out.println("Infix expression: " + infix);
    }
}
