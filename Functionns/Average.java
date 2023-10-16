package Functionns;

import java.util.Scanner;

public class Average {

    public static int averageCalculate(int[] arr){

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }

    public static int raisedPower(int x, int n){
        int res = 1;

        for(int i=1;i<=n;i++){
           // res = (int) Math.pow(x,i);
            res *= x;
        }

        return res;
    }

    public static void GCDOfTwoNumbers(int a, int b){

        if(b>a){
            int temp =a;
            a= b;
            b = temp;
        } else if (b !=0) {
            int rem = a % b;
            b = a;
            a = rem;
            System.out.println("GCD of two number is : "+ a);
        }
    }

    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;

        if(n >= 1){
            System.out.print(a + " ");
        }

        if(n >=2){
            System.out.print(b + " ");
        }
        for (int i=2;i<n;i++){
            int c = a +b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
    }

    public static void main(String args []){
        int x,n;
//        int [] arr = new int[3];
//        Scanner sc =new Scanner(System.in);
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int average = averageCalculate(arr);
//        System.out.println("Average of 3 number is "+ average);
        Scanner sc =new Scanner(System.in);
//        x =sc.nextInt();
        System.out.print("Enter the series no : ");

        n =sc.nextInt();
        //System.out.println("X to the power raised by n is : "+raisedPower(x,n));
        //GCDOfTwoNumbers(x,n);
        fibonacciSeries(n);

    }
}
