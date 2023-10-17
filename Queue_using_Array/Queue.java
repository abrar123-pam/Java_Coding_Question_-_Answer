package Queue_using_Array;

public class Queue {
    int front,rear;
    int queue[];

    Queue(){
        this.front = 0;
        this.rear = 0;
        this.queue = new int[100];
    }

    public void enqueue(int num){
        queue[rear] = num;
        rear++;
    }

    public int dequeue(){
        if(front>= rear){
            return -1;
        }

        int d = queue[front];
        front++;
        return d;
    }

}
