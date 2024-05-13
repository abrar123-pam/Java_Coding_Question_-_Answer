package Day_05;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            accessArrayElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
    public static void accessArrayElement() {
        int[] array = {1, 2, 3};
        System.out.println(array[3]);
    }
}
