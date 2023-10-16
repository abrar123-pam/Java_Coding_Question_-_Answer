package Patterns;

public class Pattern4 {
    public static void main(String args[]) {
        //floyds triangle pattern
        int n = 5;
        int NUMBER = 1;

        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(NUMBER+"  ");
                NUMBER ++;
            }
            System.out.println();
        }
    }
}

