
package uits.jv1503.lesson9;
import java.util.Arrays;
import java.util.Random;
//import static java.lang.Double.NaN;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        Point[] array = new Point[10];
        for(int i = 0; i < array.length; i++)
            array[i] = new Point(r.nextInt(200), r.nextInt(200));
//        for(Point p : array)
//            System.out.println(p.toString());
        
        Arrays.sort(array);
        for(Point p : array)
            System.out.println(p.toString());
                    
                    




//        double i = NaN;
//        if(i != i){
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
    }
}







