package Patterns;

import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        int n,i,j;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i=1;i<=n;i++){
            for (j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
