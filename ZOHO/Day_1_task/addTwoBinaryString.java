package ZOHO.Day_1_task;

import java.util.Scanner;

public class addTwoBinaryString {

    public static String binary(String num1,String num2){

        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int carry = 0,base = 2;

        StringBuilder sb = new StringBuilder();

        while (n1 >=0 || n2 >= 0){
            int t1=0,t2 =0,sum;
            if(n1 >= 0){
                t1 = num1.charAt(n1--) - '0';
            }
            if(n2 >= 0){
                t2 = num2.charAt(n2--) - '0';
            }

            sum = t1+t2+carry;

            if(sum >= base){
                carry = 1;
                sum -= base;
            }else{
                carry = 0;
            }

            sb.append(sum);
        }

        if(carry == 1){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbe1 = sc.nextLine();
        String number2  =sc.nextLine();

        String res = binary(numbe1,number2);
        System.out.println(res);
    }
}
