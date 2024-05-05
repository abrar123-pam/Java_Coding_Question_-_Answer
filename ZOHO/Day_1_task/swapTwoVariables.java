package ZOHO.Day_1_task;

//Write a Java program to swap two variables.
public class swapTwoVariables {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        swap(a, b);

    }
}
