package Patterns;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        int n,i,j;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i=0;i<n;i++){
            int num = 1;
            for (j=i;j<n;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
