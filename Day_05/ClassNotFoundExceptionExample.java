package Day_05;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            loadClass("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }

    public static void loadClass(String className) throws ClassNotFoundException {
        Class.forName(className);
    }
}
