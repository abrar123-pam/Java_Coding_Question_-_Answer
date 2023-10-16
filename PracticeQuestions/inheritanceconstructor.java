package PracticeQuestions;

class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int a){
        System.out.println(" I am constructor with a value" + a);
    }
}

class Deriver extends Base{
    Deriver(){
        super(2);
        System.out.println("I am a derived constructor");
    }

    Deriver(int x,int y){
        System.out.format("I have avalue of constructor "+ x + y +"\n" );
    }
}

class grandder extends Deriver{
    grandder(){
        super(6,8);
        System.out.println("I a grand class with constructor");
    }
}


public class inheritanceconstructor {

    public static void main(String[] args) {

//    PracticeQuestions.Deriver  d =  new PracticeQuestions.Deriver();
    grandder g = new grandder();

    }
}
