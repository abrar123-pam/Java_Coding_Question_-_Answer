package Stack_using_Array;

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        int topValue = stack.top();
        int isEmpty = stack.isEmpty();
        int isFull = stack.isFull();
        System.out.println("Top element: " + topValue);
        System.out.println("Is empty: " + isEmpty);
        System.out.println("Is full: " + isFull);

        stack.pop();
        topValue = stack.top();
        System.out.println("Top element: " + topValue);
    }
}
