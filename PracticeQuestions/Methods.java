package PracticeQuestions;

public class Methods {
        //method overloading
    public static void name(){
        System.out.println("HELLO MY NAME IS PAM");
    }

    public static void name(int a){
        System.out.println("HELLO MY AGE IS "+ a + " THIS");
    }
    public static void name(int a,int b){
        System.out.println("HELLO MY AGE"+ a +" my friend age is"+b);
    }

    public static int sum(int x,int y){
        return x+y;
    }

    public static int sum(int x,int y,int z){
        return x+y+z;
    }

    //variable args method

    public static float summ(int ...arr){
        float result = 0;

        for (float e:arr) {
            result = result+e;
        }
        float avg = result/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        name();
        name(20);
        name(23,19);
        System.out.println("The addition of 4 and 5 is: "+summ(50,50));
        System.out.println("The addition of 4 and 5 and 6 is: "+summ(4,5,6));
        System.out.println("The addition of 4 and 5 and 6,7,8,9 is: "+summ(4,5,6,7,8,9));

    }
}
