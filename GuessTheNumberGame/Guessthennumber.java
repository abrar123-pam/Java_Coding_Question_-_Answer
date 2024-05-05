package GuessTheNumberGame;

import java.util.Random;
import java.util.Scanner;

//class Game{
//
//    public void guesss(){
//
//        Scanner sc = new Scanner(System.in);
//        int number = 1+(int) (100*Math.random());
//
//        int k=5,guess;
//        int i;
//
//        System.out.println("ENTER THE NUMBER BETWEEN 1 TO 100||||");
//        for( i=0;i<=k;i++){
//            System.out.println("Guess the number");
//            guess = sc.nextInt();
//
//            if(guess< number&& i !=k-1){
//                System.out.println("you have guess the less number"+guess);
//            } else if (guess > number && i!=k-1) {
//                System.out.println("you have guess the greater nuber"+guess);
//            } else if (guess == number) {
//                System.out.println("you have guess the correct number");
//                break;
//            }
//            if(i==k){
//                System.out.println("you have exhaust the trial");
//                System.out.println("The number is "+number);
//            }
//
//        }
//
//
//
//    }
//
//}



// use constructor to generate random number
// use setnum() to set method
// us isCorrect() method to checj
// use Counter() to count the number of guess

class GuessGame{

    public int compnum;
    public int usernum;
    public int noofguess = 0;

    public int getNoofguess() {
        return noofguess;
    }

    public void setNoofguess(int noofguess) {
        this.noofguess = noofguess;
    }

    GuessGame(){
        Random rand = new Random();
        compnum = rand.nextInt(100);
    }

    void takeuserinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 100");
        usernum = sc.nextInt();

    }

    boolean iscorret(){
        noofguess++;
        if(usernum == compnum){
            System.out.format("yes you guessed it right, it was %d\n you guessed it in %d\n ",compnum,noofguess);
            return true;
        } else if (usernum > compnum) {
            System.out.println("Too high....");
        } else if (usernum < compnum) {
            System.out.println("Too low");
        }
        return false;
    }
}

public class Guessthennumber {
    public static void main(String[] args) {

        GuessGame g = new GuessGame();
        boolean b = false;
        while (!b){
            g.takeuserinput();
            b = g.iscorret();
            System.out.println(b);
        }
    }
}
