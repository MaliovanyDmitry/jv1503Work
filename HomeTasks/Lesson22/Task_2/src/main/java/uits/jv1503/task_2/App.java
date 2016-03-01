
package uits.jv1503.task_2;

public class App {
    
    public static void main(String[] args) {
        
        Man m = new Man(true, "nameMan", "secondNameMan", 175, 80);
        Wooman w = new Wooman(false, "nameWooman", "secondNameWooman", 165, 65);
        w.relationship(m);
        
                
        
    }
    
}
