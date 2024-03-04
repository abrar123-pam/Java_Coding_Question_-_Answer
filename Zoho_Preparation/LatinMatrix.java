package Zoho_Preparation;

public class LatinMatrix {

    public static char findOffset(int i, int j, int n){
        int offset = (i+j) % n;

        return (char) ('A'+offset);
    }

    public static void printLatinMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(findOffset(i,j,n) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printLatinMatrix(n);
    }
}
