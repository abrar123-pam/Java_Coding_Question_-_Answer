package PracticeQuestions;

import java.util.Scanner;

public class ArrayDimension {

    public static void main(String[] args){

        //1-D PracticeQuestions.Array
        System.out.println("1-D PracticeQuestions.Array");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int value:arr){
            System.out.print(value);
        }
        System.out.println();
        System.out.println("2-D PracticeQuestions.Array");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] ar = new int[a][b];

        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                ar[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int[] row: ar){
            for (int num: row){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
