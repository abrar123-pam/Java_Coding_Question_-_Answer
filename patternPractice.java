public class patternPractice {
    public static void main(String[] args) {
        int n = 5;

        rec();
    }

    static void rec(){
        rec();
    }

    private static void righthalf(int n) {

        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(pascal(i,j) + " ");
            }
            System.out.println();
        }

    }

    static int pascal(int n, int r){
        return factorial(n) / (factorial(n-r)*factorial(r));
    }
    static int factorial(int n){
        if(n == 0) return  1;

        return n * factorial(n-1);
    }
}
