package Functionns;

import java.util.Scanner;

public class towerofhanoi {

    public static void towerOfHanoi(int n, String src, String hel, String des){
        if(n == 1){
            System.out.println("Move Disk From "+src+" to "+des);
            return;
        }

        for (int i=1;i<=n;i++) {
            towerOfHanoi(n - 1, src, des, hel);
            System.out.println("Move Disk From " + src + " to " + des);
            towerOfHanoi(n - 1, hel, src, des);
        }
    }

    public static void main(String[] args) {
        int n ;
        System.out.print("Enter disks : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        towerOfHanoi(n,"S","H","D");
    }
}
