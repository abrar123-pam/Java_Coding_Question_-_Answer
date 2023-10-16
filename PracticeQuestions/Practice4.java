package PracticeQuestions;

class monkey{
    public void jump(){
        System.out.println("The PracticeQuestions.monkey is jumping");
    }
    public void bite(){
        System.out.println("The PracticeQuestions.monkey is biting");
    }
}

interface  Basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements Basicanimal{

    @Override
    public void eat() {
        System.out.println("THE monekey is eating");
    }
    @Override
    public void sleep() {
        System.out.println("THE monekey is sleeping");
    }
}


abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class Smartphone extends Telephone{

    @Override
    void ring() {
        System.out.println("RINGING.....");
    }

    @Override
    void lift() {
        System.out.println("LIFTING.....");
    }

    @Override
    void disconnect() {
        System.out.println("DISCONNECTING.....");
    }

    public void alarm(){
        System.out.println("ALARM....");
    }
}


public class Practice4 {
    public static void main(String[] args) {
    human h1  = new human();
//    h1.sleep();

        Smartphone t = new Smartphone();
        t.lift();
     }
}
