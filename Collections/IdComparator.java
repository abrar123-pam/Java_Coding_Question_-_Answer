package Collections;

import java.util.Comparator;

public class IdComparator implements Comparator<Rangers> {

    @Override
    public int compare(Rangers o1, Rangers o2) {
        return o1.rangerId - o2.rangerId;
    }
}
