package Patterns;

import java.util.Scanner;

public class RightAngledNumberPyramid {
    public static void main(String[] args) {
        int n,i,j;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i=1;i<=n;i++){
            int num = 1;
            for (j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
