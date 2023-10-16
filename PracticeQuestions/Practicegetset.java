package PracticeQuestions;

class cylinder{
    private int radius;
    private int height;


    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public  double surfacearea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
}

class rectangle{
    int length;
    int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 6;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


class Sphere{
   private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double volume(){
        return (4.0/3.0)*Math.PI*(radius*radius*radius);
    }

    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }
}

public class Practicegetset {


    public static void main(String[] args) {
      /*  PracticeQuestions.cylinder cy = new PracticeQuestions.cylinder(7,4);
        PracticeQuestions.rectangle rec = new PracticeQuestions.rectangle(67,55);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
       // cy.setHeight(4);
        System.out.println(cy.getHeight());
        //cy.setRadius(7);
        System.out.println(cy.getRadius());
        System.out.println(cy.volume());
        System.out.println(cy.surfacearea());*/

        Sphere sp = new Sphere();

        System.out.println(sp.surfacearea());

    }
}
