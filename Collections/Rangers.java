package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Rangers implements Comparable<Rangers> {
    int rangerId;
    String rangerName;
    String rangerPower;
    public Rangers(int rangerId,String rangerName,String rangerPower){
        this.rangerId = rangerId;
        this.rangerName = rangerName;
        this.rangerPower = rangerPower;
    }

    @Override
    public String toString() {
        return "Rangers{" +
                "rangerId=" + rangerId +
                ", rangerName='" + rangerName + '\'' +
                ", rangerPower='" + rangerPower + '\'' +
                '}';
    }


    @Override
    public int compareTo(Rangers o) {
        return this.rangerName.compareTo(o.rangerName) ;
    }

    public static void main(String[] args) {
        ArrayList<Rangers> list = new ArrayList<>();

        Rangers r1 = new Rangers(1,"samurai","fire");
        Rangers r2 = new Rangers(5,"rpm","speed");
        Rangers r3  = new Rangers(3,"ninjaStorm","water");

        list.add(r1);
        list.add(r2);
        list.add(r3);

        for (Rangers r : list){
            System.out.println(r.rangerId + " " + r.rangerName +" "+r.rangerPower);
        }
        System.out.println("*******************************************************");

        Collections.sort(list,new IdComparator());

        for (Rangers r : list){
            System.out.println(r.rangerId + " " + r.rangerName +" "+r.rangerPower);
        }

        System.out.println("*******************************************************");
        Collections.sort(list,new powerComparator());

        for (Rangers r : list){
            System.out.println(r.rangerId + " " + r.rangerName +" "+r.rangerPower);
        }

        System.out.println("*******************************************************");

    }
}
