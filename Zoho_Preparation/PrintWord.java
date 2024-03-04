package Zoho_Preparation;

public class PrintWord {

    public static void printPattern(String input){
        int n = input.length();
        char[][] arr = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(j == i){
                    arr[i][j] = input.charAt(i);
                } else if ( j == n-1-i) {
                    arr[i][j] = input.charAt(j);
                } else{
                    arr[i][j] = ' ';
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         String input = "geeksforgeeks";
         printPattern(input);
    }
}


//{0,0} -> P   {0,6} -> P
//{1,1} -> R   {1,5} -> R
//{2,2} -> O   {2,4} -> O
//{3,3} -> G   {3,3} -> G
//{4,4} -> R   {4,2} -> R
//{5,5} -> A   {5,1} -> A
//{6,6} -> M   {6,0} -> M
