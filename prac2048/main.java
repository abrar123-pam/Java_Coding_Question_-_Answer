package prac2048;

import T2048.controller.Controller;
import prac2048.controller.controller;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        controller con = new controller();

        Scanner sc =new Scanner(System.in);
        while (!(con.isWon() || con.isGameEnd())) {
            System.out.println(con);
            char ch = sc.next().charAt(0);

            switch (ch) {
                case 'l':
                    con.moveLeft();
                    break;
                case 'r':
                    con.moveRight();
                    break;
                case 'u':
                    con.moveUp();
                    break;
                case 'd':
                    con.moveDown();
                    break;
                default:
                    System.out.println("Enter valid");
                    break;
            }
            con.placeTiles();
        }

            if(con.isWon()){
                System.out.println("Congratulations you won the game");
            }

            if(con.isGameEnd()){
                System.out.println("THe game is end");
            }


    }
}
