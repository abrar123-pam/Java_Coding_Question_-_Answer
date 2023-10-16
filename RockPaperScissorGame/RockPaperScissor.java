package RockPaperScissorGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {


      //  0.Rock
      //  1.Paper
      //  2.Scissor

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int computerchoice = rand.nextInt(3);

        System.out.println("Enter your choice \n 0.Rock \n 1.Paper \n 2.Scissor");
        System.out.print("Enter your choice");
        int userchoice = sc.nextInt();

        System.out.println("your choice: " + userchoice);
        System.out.println("Computer choice: " + computerchoice);

        if(computerchoice == userchoice){
            System.out.println("Match draw");
        } else if (computerchoice == 0) {
            if(userchoice == 1){
                System.out.println("YOU WON!!");
            } else if (userchoice == 2) {
                System.out.println("Computer won");
            }
        } else if (computerchoice == 1) {
            if(userchoice == 0){
                System.out.println("Computer won!!");
            } else if (userchoice == 2) {
                System.out.println("You won");
            } else if (computerchoice == 2) {
                if(userchoice == 0) {
                    System.out.println("YOU WON!!");
                } else if (userchoice == 1) {
                    System.out.println("Computer win!!");

                }
            }

            }

        }


    }

