package SnakeAndLadder;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 10;
        int e = 10;
        int st = 100;
        String[][] arr = new String[s][e];
        for(int i=0;i<s;i++){
            if(i%2 == 0){
                for(int j=0;j<e;j++){
                    arr[i][j] = String.valueOf(st--);
                }
            }else {
                for (int j=e-1;j>=0;j--){
                    arr[i][j] = String.valueOf(st--);
                }
            }
        }

        display(arr,s,e);
        int[] playerPosition = {9,0};
        putPlayer(playerPosition,arr,s,e);

        boolean loop = true;

        while (loop){
            System.out.println("1. Do u want to roll dice\n2. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    int roll = rollDice();
                    System.out.println("You Rolled "+ roll);
                    movePlayer(roll,arr,s,e,playerPosition);
                    break;
                case 2:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter valid number");
                    break;
            }
        }
    }

    private static void movePlayer(int roll, String[][] arr, int s, int e, int[] playerPosition) {
        int currentRow = playerPosition[0];
        int currentCol = playerPosition[1];

        while (roll > 0) {
            if (currentRow % 2 == 0) {
                if (currentCol - roll >= 0) {
                    currentCol -= roll;
                    roll = 0;
                } else {
                    roll -= (currentCol + 1);
                    currentCol = 0;
                    currentRow--;
                }
            } else {
                if (currentCol + roll < e) {
                    currentCol += roll;
                    roll = 0;
                } else {
                    roll -= (e - currentCol);
                    currentCol = e - 1;
                    currentRow--;
                }
            }
        }

        if (currentRow < 0) {
            currentRow = 0;
            currentCol = 0;
            System.out.println("You reached the end!");
        }

        playerPosition[0] = currentRow;
        playerPosition[1] = currentCol;

        String cp = arr[playerPosition[0]][playerPosition[1]];
        switch (cp){
            //case ""
        }

        putPlayer(playerPosition, arr, s, e);
    }

    private static void putPlayer(int[] playerPosition,String[][] arr, int s, int e) {
        System.out.println("----------------------------------------");
        for (int i=0;i<s;i++){
            for (int j=0;j<e;j++){
                String ele = arr[i][j];
                if(i==playerPosition[0] && j==playerPosition[1]){
                    System.out.print("A ");
                } else if (ele.equals("17") || ele.equals("7")) {
                    System.out.print("s1 ");
                } else if (ele.equals("19") || ele.equals("62")) {
                    System.out.print("s4 ");
                } else if (ele.equals("64") || ele.equals("60")) {
                    System.out.print("s3 ");
                } else if (ele.equals("54") || ele.equals("34")) {
                    System.out.print("s2 ");
                } else if (ele.equals("87") || ele.equals("36")) {
                    System.out.print("s5 ");
                } else if (ele.equals("93") || ele.equals("73")) {
                    System.out.print("s6 ");
                } else if (ele.equals("95") || ele.equals("75")) {
                    System.out.print("s7 ");
                } else if (ele.equals("98") || ele.equals("79")) {
                    System.out.print("s8 ");
                }  else if (ele.equals("2") || ele.equals("38")) {
                    System.out.print("l1 ");
                }  else if (ele.equals("4") || ele.equals("14")) {
                    System.out.print("l2 ");
                }  else if (ele.equals("9") || ele.equals("31")) {
                    System.out.print("l3 ");
                }  else if (ele.equals("28") || ele.equals("84")) {
                    System.out.print("l4 ");
                }  else if (ele.equals("21") || ele.equals("42")) {
                    System.out.print("l5 ");
                }  else if (ele.equals("51") || ele.equals("67")) {
                    System.out.print("l6 ");
                }   else if (ele.equals("72") || ele.equals("91")) {
                    System.out.print("l7 ");
                }  else if (ele.equals("80") || ele.equals("99")) {
                    System.out.print("l8 ");
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private static void display(String[][] arr, int s, int e) {
        System.out.println("----------------------------------------");
        for (int i=0;i<s;i++){
            for (int j=0;j<e;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }
}

