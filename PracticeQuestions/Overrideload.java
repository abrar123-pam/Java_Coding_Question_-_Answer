package PracticeQuestions;

// method overloading concept
class overload1{
    int a;
    public int getA() {
        return a;
    }
    public void name(String s){
        System.out.println("Your name is: "+s);
    }
    public void name(int a){
        System.out.println("the number is:"+a);
    }
    public void name(int a,int b){
        System.out.println("the number is:"+a+" "+b);
    }
}

// method overriding concept
class phone{
    public void call(){
        System.out.println("Someone is calling you");
    }

    public int phonum(int a){
        System.out.println("the number is "+a);
        return a;
    }
}
class smartphone extends phone{
    @Override
    public void call(){
        System.out.println("hey # is calling you");
    }
    @Override
    public int phonum(int a){
        System.out.println("the phonew number is:"+ a);
        return a;
    }



    public void takingphoto() {
        System.out.println("hey Abbu # is want to take a photo with you");
    }
}

//Dynamic method dispatch
class computer{
    public void system(){
        System.out.println("My system ram is 16GB");
    }

    public void monitor(){
        System.out.println("the monitor is HP");
    }
}

class laptop extends computer{
    public void config(){
        System.out.println("My system ram is 8 GB");
    }
    @Override
    public void monitor(){
        System.out.println("My monitor is infinix");
    }
}

public class Overrideload {

    public static void main(String[] args) {
//        PracticeQuestions.overload1 o = new PracticeQuestions.overload1();
//        o.a= 2;
//        System.out.println(o.getA());
//        o.name("ABRAR");
//        o.name(1);
//        o.name(34,55);

//        PracticeQuestions.phone p =new PracticeQuestions.phone();
//        p.call();
//        p.phonum(222);
//
//        PracticeQuestions.smartphone sp = new PracticeQuestions.smartphone();
//        sp.call();
//        sp.takingphoto();
//        sp.phonum(345);

        computer c = new laptop();
        c.system();
        c.monitor();

    }
}
