package Functionns;

public class AdvanceRecursion {

    //Print Permutation of the character
    public static void printPerm(String str, String permu){

        if(str.length() == 0){
            System.out.println(permu);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newPer = str.substring(0,i)+ str.substring(i+1);
            printPerm(newPer,permu+curr);
        }
    }

    //Count total path in a maze to move from(0,0) to (n,m)
    public static int countPath(int i, int j, int n, int m){

        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move on downpath
        int downPath = countPath(i+1,j,n,m);
        //move on right path
        int rightPath = countPath(i,j+1,n,m);

        return downPath + rightPath;
    }

    //place tile of size 1 * m in a floor of size n*m
    public static int placeTiles(int n, int m){

        if(n == m){
            return 1;
        }
        if(n < m){
            return 2;
        }

        int verticalTiles = placeTiles(n-m,m);

        int horizontalTiles = placeTiles(n-1,m);

        return verticalTiles+horizontalTiles;
    }

    //find the number of ways in which you can invite n people to your party,single or in pair
    public static int callPeople(int n){

        if(n <= 1){
            return 1;
        }

        int single = callPeople(n-1);

        int pair = (n-1) *  callPeople(n-2);

        return single+pair;
    }

    public static void main(String[] args) {
//        String per = "123";
//        printPerm(per,"");

        int n=4;
        int m=2;
        int totalPath = countPath(0,0,n,m);
       // System.out.println("Total Path is : "+totalPath);
       // System.out.println(placeTiles(n,m));
        int call = callPeople(4);
        System.out.println("The total number of people you can invite to party single and pair is : "+call);
    }
}
