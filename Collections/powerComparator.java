package Collections;

import java.util.Comparator;

public class powerComparator implements Comparator<Rangers> {
    public int compare(Rangers o1,Rangers o2){
        return o1.rangerPower.compareTo(o2.rangerPower);

    }
}
