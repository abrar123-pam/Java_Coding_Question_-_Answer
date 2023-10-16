package DSAquestions;

public class Recursion {

    public static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }else{
            return a*factorial(a-1);
        }
    }

    public static int fact_iterative(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result += i-1;
            }
            return result;
        }
    }

    public static int factoriall(int n){
        if (n ==1 || n == 0){
            return 1;
        }

        int fact = n *factoriall(n-1);
        return fact;
    }

    public static void fibonacciSeries(int n){
        int a =0,b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int c = a + b;
        a = b;
        b =c;
        System.out.print(c);
        //fibonacciSeries(b);
    }

    public static void fibnoacciRecursion(int a, int b, int n){

        if(n == 0){
            return;
        }
        int c =a + b;

        System.out.print(c + " ");
        fibnoacciRecursion(b,c,n-1);
    }

        public static int printNos(int x) {
            int st = 0;
            if (x <= st){
                return x;
            }
            return printNos(st+1);
        }

        public static int[] generateFib(int n){
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                if(i==0) {
                    arr[i] = 0;
                }
                else if (i==1) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
            }
        return arr;
        }

    public static void main(String[] args) {

        int c = 5;
//        System.out.println("Factorial of 5 is: "+ factorial(c));
//        System.out.println("Factorial of 5 is: "+ factoriall(c));
//        int fs = 8;
//        fibonacciSeries(fs);
        int a =0, b = 1;
        int n = 8;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        fibnoacciRecursion(a,b,n-2);
        System.out.println(generateFib(c));
     //   System.out.print("NUmber : " +printNos(c));

    }
}
