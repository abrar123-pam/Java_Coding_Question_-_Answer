package ZOHO.Day_1_task;

import java.util.Random;
import java.util.Scanner;

/*   Write a program that generates a random number and asks the user to guess hat the number is.
If the user's guess is higher than the random number, the program should display "Too high,
try again." If the user's guess is lower than the random number, the program should display "Too low,
try again." The program should use a loop that repeats until the user correctly guesses the random number.
Output:43 1 19 13*/
public class random_number {
    int comp;
    random_number(){
        Random rand = new Random();
        comp = rand.nextInt(100);
        //comp = (int) (Math.random() * 100) + 1;

    }

    public boolean isCorrect(int num){
        if(num == comp){
            System.out.println("You have guess the correct number");
            return true;
        } else if (num > comp) {
            System.out.println("Too  High... Try Again");
        }else{
            System.out.println("Too Low... Try Again");
        }

        return  false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        random_number r = new random_number();
        boolean b = false;
        int user;

        while (!b){
            System.out.println("Enter the number between 1 and 100");
            user = sc.nextInt();
            b = r.isCorrect(user);
        }

    }
}
