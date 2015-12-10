
package uits.jv1503.hometask9;

import java.util.Comparator;

public class SortedByColor implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        String color1 = o1.getColor();
        String color2 = o2.getColor();
            
        return color1.compareTo(color2);
    }
    
    
    
}
