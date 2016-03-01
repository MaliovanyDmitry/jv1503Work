
package uits.jv1503.task_2;
    
import java.util.Scanner;

public class Wooman extends Human{
    
     
    
    public Wooman() {
    }

    public Wooman(boolean sex, String name, String secondName, float height, float weight) {
        super(sex, name, secondName, height, weight);
    }
    
    public Human birth(Man m){
        Human c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя ребенка: ");
        String s = scan.next();
        int proc = (int)(Math.random()*100);
        if (proc <= 50){
            c = new Human(true, s, m.secondName, (float)(m.height+0.1*(this.height - m.height)) , (float)(m.weight+0.1*(this.weight - m.weight)));
        System.out.println(c.toString());
        } else {
            c = new Human(false, s, m.secondName, (float)(this.height+0.1*(m.height - this.height)) , (float)(this.weight+0.1*(m.weight - this.weight)));
         System.out.println(c.toString());
        }
       return c;
        
       
    }
    void relationship(Human h){
        if(speak(h)==true && tolerated(h) == true && spendTimeTogether(h) == true){
            if(this.sex != h.sex){
            birth((Man) h);
            }
        } else 
        System.out.println("Не срослось");
               
    } 
}
    

