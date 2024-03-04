package Patterns;

public class Abrar_Pattern17 {

    public static void starPyramid(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=n;j>=i;j--){
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void invertedStarPyramid(int n){
        int i,j,sp;
        for (i=n;i>=1;i--){
            for (sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamondStarPattern(int n){
        int i,j,sp;
        //print top triangle
        for (i=1;i<=n;i++) {
            for (sp = n; sp > i; sp--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (i=n;i>=1;i--){
                for (sp=n;sp>i;sp--){
                    System.out.print(" ");
                }
                for (j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void halfDiamondStarPattern(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=n-1;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void binaryNumberTrianglePattern(int n){
        int i,j;
        int start = 1;
        for (i=1;i<=n;i++){
            if (i % 2 == 0){
                start =0;
            }else {
                start = 1 ;
            }
            for (j=1;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void numberCrownPattern(int n){
        int i,j,sp;
        //number Forward
        for (i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //print spaces
            for (sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            //number reverse
                for (j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
        }
    }
    public static void increasingNumberTrianglePattern(int n){
        int i,j;
        int num =1;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void increasingLetterTrianglePattern(int n){
        int i,j;
        for (i=1;i<=n;i++){
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void reverseLetterTrianglePattern(int n){
        int i,j;
        for (i=n;i>=1;i--){
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void alphaRampPattern(int n){
        int i,j;
        char ch = 'A';
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    public static void alphaHillPattern(int n){
        int i,j,sp;
        for (i=1;i<=n;i++){
            for (sp=n;sp>=i;sp--){
                System.out.print(" ");
            }
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;

            for(j=1;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void alphaTrianglePattern(int n){
        int i, j;
          // Starting character
        for (i = 1; i <= n; i++) {
            char currentChar = (char)('E'-i+1);  // Use a separate variable to keep track of the current character
            for (j = 1; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;  // Decrement the character
            }
            System.out.println();
             // Increment the starting character for the next row
        }
    }
    public static void symmetricVoidPattern(int n){
        int i,j;
        //for printing rows
        for (i=n;i>=1;i--){
            //left star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            //left space
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right space
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for printing rows
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }

            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void symmetricButterflyPattern(int n){
        int i,j;
        //Top patttern
        for (i=1;i<=n-1;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom Pattern
        for (i=1;i<=n;i++){
            for (j=n;j>=i;j--){
                System.out.print("*");
            }
            for (j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (j=n;j>=i;j--){
                System.out.print("*");
            }


            System.out.println();
        }

    }
    public static void  hollowRectanglePattern(int n){
        int i,j;

        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if (i==1 || i==n||j==1||j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {
        int n =5;
//      Scanner scanner = new Scanner(System.in);
//      n = scanner.nextInt();
        starPyramid(n);
        invertedStarPyramid(n);
        diamondStarPattern(n);
        halfDiamondStarPattern(n);
        binaryNumberTrianglePattern(n);
        numberCrownPattern(n);
        increasingNumberTrianglePattern(n);
        increasingLetterTrianglePattern(n);
        reverseLetterTrianglePattern(n);
        alphaRampPattern(n);
        alphaHillPattern(n);
        alphaTrianglePattern(n);
        symmetricVoidPattern(n);
        symmetricButterflyPattern(n);
        hollowRectanglePattern(n);

    }
}
