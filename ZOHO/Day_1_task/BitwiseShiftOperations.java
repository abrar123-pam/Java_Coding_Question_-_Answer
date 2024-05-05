package ZOHO.Day_1_task;

public class BitwiseShiftOperations {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 6;

        int resultAnd = num1 & num2;
        System.out.println(resultAnd);

        int resultOr = num1 | num2;
        System.out.println(resultOr);

        int resultXor = num1 ^ num2;
        System.out.println(resultXor);

        int resultLeftShift = num1 << 2;
        System.out.println(resultLeftShift);

        int resultRightShift = num1 >> 1;
        System.out.println(resultRightShift);
    }
}
