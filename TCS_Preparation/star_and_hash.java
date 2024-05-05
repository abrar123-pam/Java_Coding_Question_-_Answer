package TCS_Preparation;
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0

import java.util.ArrayList;

public class star_and_hash {

    public static int findLength(String str, int n){
        ArrayList<Character> star = new ArrayList<>();
        ArrayList<Character> hash = new ArrayList<>();

        for (int i=0;i<n;i++){
            if(str.charAt(i)== '*'){
                star.add(str.charAt(i));
            }else {
                hash.add(str.charAt(i));
            }
        }

        int starLength = star.size();
        int hashLength = hash.size();

        if(starLength > hashLength){
            return 1;
        } else if (hashLength > starLength) {
            return  -1;
        }else {
            return 0;
        }
    }

    public static int findLenghtUsingVariable(String str, int n){
        int star = 0;
        int hash = 0;

        for(int i=0;i<n;i++){
            if (str.charAt(i)=='*'){
                star++;
            }else {
                hash++;
            }
        }

        if(star > hash){
            return 1;
        } else if (hash > star) {
            return  -1;
        }else {
            return 0;
        }


    }

    public static void main(String[] args) {
        String str = "####****";
        int n = str.length();
        int ans = findLength(str,n);
        int ans1 = findLenghtUsingVariable(str,n);
        System.out.println(str +"->"+ ans1);
    }
}
