package PracticeQuestions;

abstract class Bike{

    Bike(){
        System.out.println(" i am bike constructor");
    }

    abstract void run();

    public void customer(){
        System.out.println("Welcome to showroom[][]");
    }

    public static class practice5 {

    }
}

class platina extends Bike{

    @Override
    void run() {
        System.out.println("its running");
    }

    public void milage(){
        System.out.println("30 km per liter");
    }
}

public class Abstract {
    public static void main(String[] args) {

        platina p = new platina();

        p.run();
        p.milage();p.customer();
    }
}
