package Zoho_Preparation;

import java.util.Scanner;

public class maximumNoOfChoclates {

    public static void findChoclate(int money, int price, int wrappers, int choco, int mv){

        int choclatesBuy = money / price;

        int minWrap = choclatesBuy / wrappers;

        int choclatesEaten = choclatesBuy;

        choclatesEaten += minWrap;

        int wrapperLeft = minWrap + (choclatesBuy % wrappers);

        System.out.println(choclatesEaten);
        System.out.println(wrapperLeft);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Money : ");
        int money = sc.nextInt();

        System.out.print("\nPrice : ");
        int price = sc.nextInt();

        System.out.print("\nWrappers : ");
        int wrappers = sc.nextInt();

        System.out.print("\nChoco : ");
        int choco = sc.nextInt();

        System.out.print("\nMax visit : ");
        int mv = sc.nextInt();

        findChoclate(money,price,wrappers,choco,mv);

    }
}
