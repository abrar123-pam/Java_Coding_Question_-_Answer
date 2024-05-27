package Zoho_Preparation;

import java.util.Arrays;
import java.util.Stack;

public class asteroidCollisiion {
    public static void main(String[] args) {
         int[] arr = {10,2,-5};
         int n = arr.length;

         int[] a = asteroidCollisions(arr);
        System.out.println(Arrays.toString(a));
    }

    public static int[] asteroidCollisions(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids){

            while(!st.isEmpty() && a<0 && st.peek()>0){
                int sum  = a+st.peek();

                if(sum <0){
                    st.pop();
                }else if(sum > 0){
                    a =0;
                    break;
                }else{
                    st.pop();
                    a= 0;
                    break;
                }
            }

            if(a!=0){
                st.push(a);
            }
        }

        int n = st.size();
        int[] arr = new int[n];

        int s = n-1;
        while(!st.isEmpty()){
            arr[s] = st.pop();
            s--;
        }

        return arr;
    }
    private static int[] astCollision(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        for(int a:arr){

            while (!st.isEmpty() && a<0 && st.peek()>0){
                int sum = a+st.peek();

                if(sum < 0){
                    st.pop();
                }else if(sum > 0){
                    a=0;
                    break;
                }else{
                    st.pop();
                    a=0;
                    break;
                }
            }

            if(a!=0){
                st.push(a);
            }
        }

        int[] ans= new int[st.size()];
        int m = st.size()-1;
        while (!st.isEmpty()){
            ans[m--] = st.pop();
        }

        return ans;

    }
}
