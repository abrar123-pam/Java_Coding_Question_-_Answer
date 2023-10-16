package Thread;

class myThread implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (i<= 1000){
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class myThread3 implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while (i<= 1000){
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}
public class implementThread {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        Thread thread = new Thread(t1);
        thread.start();
        myThread3 t2 = new myThread3();
        Thread th= new Thread(t2);
        th.start();
    }
}
