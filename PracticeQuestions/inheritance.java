package PracticeQuestions;

class Animal{

    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("I can bark");
    }

}

public class inheritance {


    public static void main(String[] args) {

        Dog  d = new Dog();
        d.name ="tommy";
        System.out.println(d.name);
        d.eat();
        d.bark();
    }
}
