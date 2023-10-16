package PracticeQuestions;

public class method_practice {


    //program to prinnt multiplication table
    static void multiplication(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+ i + " = "+ n*i);
        }
    }
    //program to print pattern
    static void pattern(int n){

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

//    program to print sum of first n natural numbers
    static int sumnat(int n){
        if(n==1){
            return 1;
        }else
            return n+sumnat(n-1);
    }
    //    program to fing fibonacci series

    static  int fibser(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibser(n - 1)+fibser(n-2);
        }
    }

    public static void Mul(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n +"*"+i+" ="+n*i);
        }
    }
    public static void main(String[] args) {
//        multiplication(9);
//       pattern(5);
//        int c =sumnat(3);
//        System.out.println(c);
        Mul(5);
//        int result =fibser(7);
//        System.out.println(result);
    }
}
