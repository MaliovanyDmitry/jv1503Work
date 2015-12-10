
package uits.jv1503.hometask9;

import java.util.Comparator;

public class SortedByWeight implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        double weight1 = o1.getWeight();
             double weight2 = o2.getWeight();

             if(weight1 > weight2) {
                return 1;
             }
             else if(weight1 < weight2) {
                return -1;
             }
             else {
                return 0;
             }
    }
}
