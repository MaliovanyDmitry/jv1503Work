
package uits.jv1503.interfaces;

public class App {
    
    public static void main(String[] args) {
        Bag b = new Bag();
       
        b.put(new FOrange(0.5, "color", true, 90, false));
        b.put(new FApple(0.5, "color", true, 90, false));
        b.put(new FPear(0.5, "color", true, 90, false));
        b.put(new FBanana(0.5, "color", true, 90, false));
        b.put(new FOrange(0.5, "color", true, 90, false));
        b.put(new VCarrot(0.5, "color", true, 90, false));
        b.put(new VCelery(0.5, "color", true, 90, false));
        b.put(new VOnion(0.5, "color", true, 90, false));
        b.put(new VPotatoes(0.5, "color", true, 90, false));
        b.put(new VPotatoes(0.5, "color", true, 90, false));
       
        b.printBag();
        System.out.println(b.getCount());
        System.out.println(" ");
        b.extractAllFruits();
        b.printBag();
        System.out.println(b.getCount());
        
        
        
         
    }
    
}
