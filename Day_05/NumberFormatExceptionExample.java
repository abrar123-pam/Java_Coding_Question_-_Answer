package Day_05;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            convertToInteger("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }
    }

    public static void convertToInteger(String str) throws NumberFormatException {
        int num = Integer.parseInt(str);
    }
}
