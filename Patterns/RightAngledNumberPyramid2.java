package Patterns;

import java.util.Scanner;

public class RightAngledNumberPyramid2 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int num = 1;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }
}
