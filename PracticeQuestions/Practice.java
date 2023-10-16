package PracticeQuestions;

import java.util.Scanner;



                public class Practice {
                        public static boolean isPrime(int num) {
                                //Your code goes here
                                if(num == 1){
                                        return false;
                                }

                                if(num % num == 0 && num % 1 == 0){
                                        return true;
                                }
                                else{
                                        return false;
                                }
                        }

        public static void main(String[] args) {
                System.out.print("Enter the number: ");
                Scanner sc =  new Scanner(System.in);
                int num = sc.nextInt();
                boolean res = isPrime(num);
                System.out.println(res);
        }


        }


