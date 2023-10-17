package Stack_using_Array;

public class Stack {

    int top;
    int capacity;
    int stackArr[];

    Stack(int capacity){
        this.top = -1;
        this.capacity = capacity;
        this.stackArr = new int[capacity];
    }

    public void push(int num){
        if (isFull() == 0 ){
            stackArr[++top] = num;
        }
    }

    public int pop(){
        if(isEmpty() == 1){
            return -1;
        }else {
            return stackArr[top-- ];
        }

    }

    public int top(){
        if(isEmpty() == 1){
            return -1;
        }else {
            return stackArr[top];
        }
    }

    public int isEmpty(){
        if (top == -1){
            return 1;
        }else {
            return 0;
        }
    }

    public int isFull(){
        if (top == capacity-1   ){
            return 1;
        }else {
            return 0;
        }
    }

}
