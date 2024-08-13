package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,2,6};

        int[] ans = getGreater(arr);
        for(int i:ans){
            System.out.println(i);
        }
    }

    private static int[] getGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                map.put(arr[i],-1);
            }else{
                while (!stack.isEmpty() && arr[i] >= stack.peek()){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    map.put(arr[i],-1);
                }else {
                    map.put(arr[i],stack.peek());
                }
                stack.push(arr[i]);
            }
        }

        for (int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
