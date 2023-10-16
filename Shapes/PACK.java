package Shapes;


class Rectangle{

    int length;
    int breadth;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area1(int l,int b){
        System.out.println(l * b);
        System.out.println("area");
    }

    public void perimeter1(int l,int b){
        System.out.println(2 * (l+b));
    }
}
class Square extends Rectangle{

    int side;

    public int  getside(){
        return side;
    }

    public void setside(int side){
        this.side = side ;
    }

    public void area2(){
        System.out.println(side*side);
        System.out.println("area2");
    }
    public void perimerter2(){
        System.out.println(4* side);
    }




}
class circle{

}
class cylinder{

}
class sphere{

}

public class PACK {

    public static void main(String[] args) {

//        Rectangle r = new Rectangle();
//        r.area(4,6);
//        r.perimeter(4,6);

        Square s = new Square();
        s.area1(4,6);
        s.area2();

    }
}
