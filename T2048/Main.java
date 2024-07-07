package T2048;

import T2048.controller.Controller;
import java.util.Scanner;

public class Main {
    private Controller controller = new Controller();
    private Scanner scanner;

    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    private void runLoop() {
        while(!(controller.isGameOver() || controller.isWon())) {
            System.out.println(controller);
            System.out.print("Enter Move (l|r|u|d): ");
            var move = scanner.nextLine();

            switch(move.toLowerCase()) {
                case "l":
                    controller.moveLeft();
                    break;
                case "r":
                    controller.moveRight();
                    break;
                case "u":
                    controller.moveUp();
                    break;
                case "d":
                    controller.moveDown();
                    break;
            }

            controller.placeTiles();
        }

        if(controller.isWon()) {
            System.out.println("You Won");
        }

        if(controller.isGameOver()) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var game = new Main(scanner);
            game.runLoop();
        }
    }
}
