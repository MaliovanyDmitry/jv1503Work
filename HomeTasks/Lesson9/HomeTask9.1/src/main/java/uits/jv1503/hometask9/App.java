
package uits.jv1503.hometask9;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    
        Cars[] car = new Cars[5];
        
        car[0] = new Cars("waz","red",1500);
        car[1] = new Cars("mersedes","yellow",2500);
        car[2] = new Cars("bmw","yellow",2500);
        car[3] = new Cars("mersedes","red",2000);
        car[4] = new Cars("opel","blue",2000);
        
        
         // выведем данные без сортировки
             System.out.println("============ no sorted ==============");
            
             for(Cars i : car) {
                System.out.println("Name: " + i.getName() +", color: " + i.getColor() +", weight: " + i.getWeight());
             }
            
             // отсортируем и выведем данные по названию
             System.out.println("========== sorted by name===========");

             Arrays.sort(car, new SortedByName());
            
             for(Cars i : car) {
                System.out.println("Name: " + i.getName() +", color: " + i.getColor() +", weight: " + i.getWeight());
             }     

             // отсортируем и выведем данные по названию
             System.out.println("========== sorted by color ===========");
            
             Arrays.sort(car, new SortedByColor());
             for(Cars i : car) {
                System.out.println("Name: " + i.getName() +", color: " + i.getColor() +", weight: " + i.getWeight());
             }
             
             // отсортируем и выведем данные по названию
             System.out.println("========== sorted by weight ===========");
            
             Arrays.sort(car, new SortedByWeight());
             for(Cars i : car) {
                System.out.println("Name: " + i.getName() +", color: " + i.getColor() +", weight: " + i.getWeight());
             }
        
        
    }

   
    
}
