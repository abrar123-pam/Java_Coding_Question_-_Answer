package Shapes;
import java.util.Scanner;

public class AP {


    public int z =20;
    protected  int y = 6;
    int u = 77;
    private int x =10;

    int len,bre,rad;
    double pie = 3.14,area,perimeter;
    Scanner sc =new Scanner(System.in);

    void square(){
        System.out.print("Enter the area & perimeter of square:  ");
        len = sc.nextInt();
        area = len*len;
        System.out.println("the AREA of square is: "+area);
        perimeter = 4*len;
        System.out.println("the PERIMETER of square is: "+perimeter);
    }

    void rectangle(){
        System.out.print("Enter the area of rectangle: ");
        len = sc.nextInt();
        System.out.print("Enter the perimeter of rectangle: ");
        bre = sc.nextInt();
        area = len*bre;
        System.out.println("the AREA of rectangle is:  "+ area);
        bre = 2*(len+bre);
        System.out.println("the PERIMETER of rectangle is: "+bre);
    }

    void circle(){
        System.out.print("Enter the radius of circle: ");
        rad = (int) sc.nextDouble();
        area = Math.PI*rad*rad;
        System.out.println("the AREA of circle is: "+ area);
        perimeter = 2*Math.PI*rad;
        System.out.println("the PERIMETER of circle is:"+ perimeter);
    }

    public static void main(String[] args) {
        AP areabre = new AP();
        areabre.square();
        areabre.rectangle();
        areabre.circle();
    }

}
