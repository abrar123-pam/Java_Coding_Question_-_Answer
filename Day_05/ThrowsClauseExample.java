package Day_05;

import java.io.FileNotFoundException;

public class ThrowsClauseExample {
    public static void main(String[] args) {
        try {
            readFromFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    public static void readFromFile(String filename) throws FileNotFoundException {
        throw new FileNotFoundException("File not found: " + filename);
    }
}
