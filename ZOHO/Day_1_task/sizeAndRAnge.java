package ZOHO.Day_1_task;

public class sizeAndRAnge {
    public static void main(String[] args) {

        System.out.println("Size and Range of various datatypes");

        System.out.println("Integer Data Types");
        System.out.println("byte : size = "+Byte.SIZE+" bits, Range = "+Byte.MIN_VALUE +" to "+Byte.MAX_VALUE);
        System.out.println("short : size = "+Short.SIZE+" bits, Range = "+Short.MIN_VALUE +" to "+Short.MAX_VALUE);
        System.out.println("int : size = "+Integer.SIZE+" bits, Range = "+Integer.MIN_VALUE +" to "+Integer.MAX_VALUE);
        System.out.println("long : size = "+Long.SIZE+" bits, Range = "+Long.MIN_VALUE +" to "+Long.MAX_VALUE);


        System.out.println("FLoating Data Types");
        System.out.println("float : size = "+Float.SIZE+" bits, Range = "+Float.MIN_VALUE +" to "+Float.MAX_VALUE);
        System.out.println("double : size = "+Double.SIZE+" bits, Range = "+Double.MIN_VALUE +" to "+Double.MAX_VALUE);

        System.out.println("Other types");
        System.out.println("character : size = "+Character.SIZE+" bits, Range = "+(int)Character.MIN_VALUE +" to "+(int)Character.MAX_VALUE);

    }
}
