package Zoho_Preparation;

import java.util.Scanner;

public class DolusNumber {

    public static boolean uglyNumber(int n){
        if(n<= 0){
            return false;
        }

        while (n!=1){
            if(n%2==0){
                n /= 2;
            }else if(n%3==0){
                n /= 3;
            }else if(n%5 == 0){
                n /= 5;
            }else {
                break;
            }
        }

        if(n ==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ans = uglyNumber(n);
        System.out.println(ans);
    }
}
