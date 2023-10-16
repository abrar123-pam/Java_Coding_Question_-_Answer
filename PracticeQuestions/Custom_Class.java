package PracticeQuestions;

//class Employee {
//
//    int salary;
//    String name;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getname() {
//        return name;
//    }
//}
//    class cellphone{
//
//        public void ring(){
//            System.out.println("RINGING........");
//        }
//        public void vibrate(){
//            System.out.println("VIBRATING.......");
//        }
//    }


class square{

    float pi = 3.14159f;
    int length;
//    int breadth;

    public float area(){
        return  pi*length*length;
    }

    public float perimeter(){
        return  2*pi*length;
    }

}

public class Custom_Class {

    public static void main(String[] args) {
//
//        Employee john = new Employee();
//        cellphone vivo = new cellphone();
        square value = new square();


        value.length = 4;
//        value.breadth = 5;
        System.out.println(value.area());
        System.out.println(value.perimeter());
//
//        john.salary = 20000;
//        john.name = "Johnny";

//      System.out.println(john.getSalary());
//      System.out.println(john.getname());
//        vivo.ring();
//        vivo.vibrate();
    }
}
