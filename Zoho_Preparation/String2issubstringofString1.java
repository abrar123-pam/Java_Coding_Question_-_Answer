package Zoho_Preparation;

public class String2issubstringofString1 {

    public static int findIndex(String s1,String s2){

        return s1.indexOf(s2);
    }

    public static void main(String[] args) {
        String s1 = "test123string";
        String s2 = "est";

        int index = findIndex(s1,s2);
        System.out.println(index);
    }
}
