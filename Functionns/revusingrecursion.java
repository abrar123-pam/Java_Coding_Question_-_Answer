package Functionns;

import java.util.HashSet;

public class revusingrecursion {
    public static int first = -1;
    public static int last = -1;
    public static boolean[] map = new boolean[26];
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void revString(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revString(str,idx-1);
    }

    public static void findOccurence(String str,int idx,char ch){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == ch){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurence(str,idx+1,'a');
    }

    public static boolean isSorted(int[] arr, int idx){

        if (idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return isSorted(arr,idx+1);
        }else {
            return false;
        }
    }
    //move x to the right
    public static void moveRight(String str,int idx,int count,String ne){
        if(idx == str.length()){
            for (int i=0;i<count;i++){
                ne += 'x';
            }
            System.out.println(ne);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            moveRight(str,idx+1,count,ne);
        }else {
            ne += curr;
            moveRight(str,idx+1,count,ne);
        }
    }

    public static void removeDuplicates(String str, int idx, String newString){

        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a']){
            removeDuplicates(str,idx+1,newString);
        }else {
            newString += curr;
            map[curr-'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }

    public static void subSequences(String str, int idx, String newstring,HashSet<String> set){

        if (idx == str.length()){
            if(set.contains(newstring)){
                return;
            }else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char curr = str.charAt(idx);

        //come
        subSequences(str,idx+1,newstring+curr,set);
        //not come
        subSequences(str,idx+1,newstring,set);
    }

    public static void keypad(String str, int idx, String newstring){

        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char curr = str.charAt(idx);

        String mapping = keypad[curr-'0'];

        for(int i=0;i<mapping.length();i++){
            keypad(str,idx+1,newstring+mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "Musharraf";
        //revString(str,str.length()-1);
        //findOccurence(str,1,'a');

//        in    t[] arr = {10,20,30,40};
//        //isSorted(arr,0);
//        System.out.println(isSorted(arr,0));

        String st = "axvbmxxdcxdx";
        String sub = "123";
        String num = "23";
       // moveRight(st,0,0,"");
       // removeDuplicates(st,0,"");
        HashSet <String> set = new HashSet<>();
        subSequences(sub,0,"",set);
       // keypad(num,0,"");

    }
}
