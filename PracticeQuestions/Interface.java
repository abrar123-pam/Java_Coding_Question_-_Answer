package PracticeQuestions;

interface phone1{
    void pocophone();
    void vivophone();
}

interface phone2{
    void xioami();
    void poco();
}


class Mycellphone {

    public long number(long number){
        System.out.println("The PracticeQuestions.phone number is"+number);
        return number;
    }
}
class mobile extends Mycellphone implements phone1,phone2{
    public void pocophone(){
        System.out.println("I'ts a poco PracticeQuestions.phone");
    }
    public  void vivophone(){
        System.out.println("I'ts a vivo PracticeQuestions.phone");
    }
    public  void xioami(){
        System.out.println((" its a redmi PracticeQuestions.phone"));
    }

    public void poco() {
        System.out.println("its a poco PracticeQuestions.phone");

    }

}

public class Interface {

    public static void main(String[] args) {

        phone2 p2 = new mobile();
        p2.poco();
        p2.xioami();
    }
}
