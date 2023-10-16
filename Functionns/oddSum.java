package Functionns;

import java.util.Scanner;

public class oddSum {

    public static int sumOfOdd(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
    public static void greaterNumber(int a, int b){
        if(a > b){
            System.out.format("%d",a);
        }else {
            System.out.format("%d",b);
        }
    }

    public static int circumferenceCircle(int rad){
        int cir = (int) (2 * Math.PI * rad);
        return cir;
    }

    public static void PosNegZero(int posCount,int negCount, int zero){


        System.out.println("Positive count is : "+posCount);
        System.out.println("Negative count is : "+negCount);
        System.out.println("Zero count is : "+zero);

        return;
    }

    public static void main(String args[]){
        int n,a,b;
        Scanner sc = new Scanner(System.in);

       // a = sc.nextInt();
       // b = sc.nextInt();
       // greaterNumber(a,b);
       // System.out.println("Sum of ODD number is "+ sumOfOdd(n));
       // System.out.println("Circumference of the circle is : "+ circumferenceCircle(n));

        int posCount = 0;
        int negCount = 0;
        int zero = 0;
        char ch;

       do{
           System.out.println("Enter # to stop");
           n = sc.nextInt();

           if(n > 0){
               posCount++;
           } else if (n < 0) {
               negCount++;
           }else {
               zero++;
           }

           System.out.println("Do you want to enter more numbers (Y/N) ");
           ch = sc.next().charAt(0);
       }while (Character.toUpperCase(ch) == 'Y');
        PosNegZero(posCount,negCount,zero);



    }
}
