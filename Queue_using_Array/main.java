package Queue_using_Array;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();



        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        while (true){
            int q = queue.dequeue();
            if(q == -1){
                break;
            }
            System.out.println(q);

        }


    }
}
