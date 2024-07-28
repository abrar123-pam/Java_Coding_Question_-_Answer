package DSAquestions;

public class first_occurence {
    public static int strStr(String haystack, String needle) {
        int nlen = needle.length();

        int i=0,j=nlen-1;

        while(j < haystack.length()){
            System.out.println(i);
            System.out.println(j);
            String sub = haystack.substring(i,j+1);
            System.out.println(sub);
            if(needle.equals(sub)) return i;

            i++;
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
