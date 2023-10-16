package PracticeQuestions;

class parent{
    int a;
    public parent(int a){
       this.a = a;
    }
    public int getA() {
        return a;
    }
}

class animal{

    public void animalsounds(){
        System.out.println("HAHAHAHAHAHHAAH");
    }
}

class dog extends animal{
    public void animalsound(){
        super.animalsounds();
        System.out.println("I am a PracticeQuestions.dog:: bow bow");
    }
}

public class This_Super {

    public static void main(String[] args) {
//        PracticeQuestions.parent p = new PracticeQuestions.parent(4);
//        System.out.println("The value of a is:"+p.getA());

//        PracticeQuestions.dog d = new PracticeQuestions.dog();
//        d.animalsound();

        animal a = new animal();
        a.animalsounds();
    }
}
