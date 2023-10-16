package PracticeQuestions;

import java.util.*;

public class Dif {

    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int large = arr[0];
//        int small = arr[0];
//        int l = 0,s = 0;
//
//        for(int i=1;i<n;i++){
//
//            if(arr[i] > large){
//                large = arr[i];
//                l = i;
//            }
//
//            if(arr[i] < small){
//                small = arr[i];
//                s = i;
//            }
//
//        }
//
//        int res = l-s;
//        System.out.println(res);
//
//    }
                int n;
                Scanner sc = new Scanner(System.in);
                n =sc.nextInt();

                int oddSum = 0;
                int evenSum = 0;

                while(n!=0) {
                    int rem = n % 10;
                    if (rem % 2 == 0) {
                        evenSum += rem;
                    } else {
                        oddSum += rem;
                    }
                    n/= 10;
                }
        System.out.println(evenSum+oddSum);

    }
        }

