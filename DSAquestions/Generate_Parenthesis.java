package DSAquestions;

import java.util.ArrayList;

public class Generate_Parenthesis {

    public static boolean isValid(StringBuilder str) {
        int balance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
    public static void solve(int n, ArrayList<String> result, StringBuilder str){

        if(str.length() == 2*n){
            if(isValid(str)){
                result.add(String.valueOf(str));
            }
            return;
        }

        str.append('(');
        solve(n,result,str);
        str.deleteCharAt(str.length()-1);

        str.append(')');
        solve(n,result,str);
        str.deleteCharAt(str.length()-1);
    }
    public static void printParentheses(int n) {

        ArrayList<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        solve(n,result,str);

        for (String s:result) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        printParentheses(n);
    }
}
