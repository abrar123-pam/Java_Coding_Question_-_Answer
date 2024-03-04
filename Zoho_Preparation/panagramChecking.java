package Zoho_Preparation;

public class panagramChecking {

    public static boolean checKPanagram(String str){
        int n = str.length();
        char ch = 'a';

        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(c == ' '){
                continue;
            }else if(c != ch) {
                return false;
            }else{
                ch++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcdefG hiJklmnOPQR Stuvwxyz";

        boolean check = checKPanagram(str.toLowerCase());

        System.out.println(check);
    }
}
