package Zoho_Preparation;

public class expandTheGivenString {

    public static void expandString(String str, int n){

        for(int i=0;i<n-1;i+= 2){
            char ch = str.charAt(i);
//            int freq = Character.getNumericValue(str.charAt(i+1));
            int freq =str.charAt(i+1) -'0';
            for(int j=0;j<freq;j++){
                System.out.print(ch+" ");
            }
        }
    }

    public static void expandStringDoubleDigit(String str,int n){

        int res = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                char ch = str.charAt(i-1);
                res = 0;
                while (i<n && (str.charAt(i)>=48 && str.charAt(i)<=57)){
                    res = res * 10 + Integer.parseInt(str.charAt(i)+"");
                    i++;
                }

                while (res >0){
                    System.out.print(ch+"");
                    res--;
                }

            }
        }
    }

    public static void main(String[] args) {
        String str = "a10b20";
        String s = "a1b4c5d3";
        int n =str.length();
        int n1= s.length();

        expandString(s,n1);
        //for double digit number

        expandStringDoubleDigit(str,n);
    }
}
