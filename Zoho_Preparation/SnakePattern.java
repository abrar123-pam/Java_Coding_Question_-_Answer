package Zoho_Preparation;

public class SnakePattern {

    public static void printPattern(int n){
        int num = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                // Even Row: Left to Right
                for(int j = 0; j < n; j++){
                    System.out.print(num++ + " ");
                }
            }else{
                // Odd Row: Right to Left
                int startNum = num + n - 1;  // Calculate the starting number for the odd row
                for(int k = 0; k < n; k++){
                    System.out.print(startNum-- + " ");
                }
                num += n;  // Update num for the next even row
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
