package Thread;

class myThread1 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i<= 100){
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i<= 100){
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}
public class extendThread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
