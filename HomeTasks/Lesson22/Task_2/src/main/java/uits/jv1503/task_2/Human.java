
package uits.jv1503.task_2;

import java.util.Random;
import java.util.Scanner;


public class Human {
    
    boolean sex;
    String name;
    String secondName;
    float height;
    float weight;
    
    boolean speak(Human h){
        if(this.sex == true && h.sex == true ){
        Random random = new Random();
        return random.nextBoolean();
        } 
        return true;
    } 
    
    boolean tolerated(Human h){
        int proc;
        int i = (int)(Math.random()*1000);
        if(this.sex == false && h.sex == false ){
            proc = 50;
        } else if (this.sex == true && h.sex == true ){
            proc = 56;
        } else {
            proc = 700;
                }
        if(i <= proc) 
            return false;
        else 
            return true;
    }
    boolean spendTimeTogether(Human h){
        int proc;
        int i = (int)(Math.random()*100);
        if(Math.abs(this.height-h.height)>(this.height/10)|| Math.abs(this.height-h.height)>(h.height/10))
            proc = 85;
        else proc = 95;
        if(i <= proc)
            return true;
        else
            return false;
    }
//    Human relationship(Human h){
//        if(speak(h)==true && tolerated(h) == true && spendTimeTogether(h) == true){
//            if(this.sex != h.sex){
//            h.birth(h);
//            }
//        } else 
//        System.out.println("Не срослось");
//        return null;
//        
//    } 
  

    public Human() {
    }

    public Human(boolean sex, String name, String secondName, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.secondName = secondName;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" + "sex=" + sex + ", name=" + name + ", secondName=" + secondName + ", height=" + height + ", weight=" + weight + '}';
    }
//    public Human birth(Human m){
//        Human c;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите имя ребенка: ");
//        String s = scan.next();
//        int proc = (int)(Math.random()*100);
//        if (proc <= 50){
//            c = new Human(true, s, m.secondName, (float)(m.height+0.1*(this.height - m.height)) , (float)(m.weight+0.1*(this.weight - m.weight)));
//        System.out.println(c.toString());
//        } else {
//            c = new Human(false, s, m.secondName, (float)(this.height+0.1*(m.height - this.height)) , (float)(this.weight+0.1*(m.weight - this.weight)));
//         System.out.println(c.toString());
//        }
//       return c;
//        
//       
//    }
    
    
    
    
    
    
    
}
