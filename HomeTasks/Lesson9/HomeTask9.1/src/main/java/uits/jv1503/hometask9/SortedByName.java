
package uits.jv1503.hometask9;

import java.util.Comparator;

public class SortedByName implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
            
        return name1.compareTo(name2);
    }
    
    
    
}
