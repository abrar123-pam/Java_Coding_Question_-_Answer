package Stack_using_Queue;

import java.util.*;
public class Stack {

    Queue<Integer> queue;
    Stack(){
        queue = new LinkedList<>();
    }

    public void push(int element){
        queue.add(element);

        for (int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
    }
    public  int pop(){
        if(isEmpty()){
            return  -1;
        }

        return queue.remove();
    }
    public int top(){
        if (isEmpty()){
            return -1;
        }
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
