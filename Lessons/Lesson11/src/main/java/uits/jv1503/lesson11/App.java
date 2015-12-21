
package uits.jv1503.lesson11;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Planets p1 = Planets.VENUS;
        Planets p2 = Planets.SATURN;
        
        System.out.println(p1.ordinal());
        System.out.println(p2.ordinal());
        System.out.println(p1.name());
        System.out.println(Arrays.toString(p1.values()));
        p1 = Planets.valueOf("SATURN");
        System.out.println(p1.name());
    }
    
    public static enum Planets{
        VENUS(2), EARTH(3), MARS(4), SATURN(6);
        
        private int i;
        
        private Planets(int i){
            this.i = i;
        }
        
        public int num(){
            return this.i;
        }
    }
    
}
