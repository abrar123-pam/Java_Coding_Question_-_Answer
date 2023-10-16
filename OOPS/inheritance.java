package OOPS;

class phone{
    String name;

    public void display(){
        System.out.println("Phone Class");
    }
}

class tablet extends phone{

    public void display1(String name) {
        System.out.println("Tablet is inherited by phone class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        tablet tablet = new tablet();
        tablet.name = "ABRAR";
        tablet.display1(tablet.name);
        tablet.display();
    }
}
