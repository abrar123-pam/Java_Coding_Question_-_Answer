package OOPS;

class department{
    String dept;
    int totalStrength;

    public void printInfo(String dept){
        System.out.println(dept);
    }
    public void printInfo(int ts){
        System.out.println(ts);
    }
    public void printInfo(String name ,int ts){
        System.out.println(name + " " +ts);
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        department dep = new department();
        dep.printInfo("CSE");
        dep.printInfo(51);
        dep.printInfo("CSE",51);
    }
}
