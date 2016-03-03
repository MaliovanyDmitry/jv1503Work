
package uits.jv1503.task_1;

public class App {
    public static void main(String[] args) {

        Toy[] newToys = new Toy[10];
        newToys[0] = new Doll("material", "manufacturer", 2, "name", 1);
        newToys[1] = new Doll("material", "manufacturer", 2, "name", 2);
        newToys[2] = new Doll("material", "manufacturer", 2, "name", 3);
        newToys[3] = new Doll("material", "manufacturer", 2, "name", 4);
        newToys[4] = new Doll("material", "manufacturer", 2, "name", 5);
        newToys[5] = new Doll("material", "manufacturer", 2, "name", 6);
        newToys[6] = new Doll("material", "manufacturer", 2, "name", 7);
        newToys[7] = new Doll("material", "manufacturer", 2, "name", 8);
        newToys[8] = new Doll("material", "manufacturer", 2, "name", 9);
        newToys[9] = new Doll("material", "manufacturer", 2, "name", 10);
//        Transformer[] transformers = inerTransformers();
 //       Transformer.printAveragePrice(transformers);
//        Doll[] dolls = inerDolls();
//        Doll.printAveragePrice(dolls);
        Container c = new Container();
//        c.addProduct(new Doll("material", "manufacturer", 3, "name", 100));
//        System.out.println(c.toString());
        c.put(new Doll("material", "manufacturer", 2, "name", 200));
        c.put(new Doll("material", "manufacturer", 2, "name", 10));
        c.put(new Doll("material", "manufacturer", 2, "name", 45));
        c.put(new Doll("material", "manufacturer", 2, "name", 582));
        c.put(new Doll("material", "manufacturer", 2, "name", 112));
        c.put(new Doll("material", "manufacturer", 2, "name", 113));
        c.put(new Doll("material", "manufacturer", 2, "name", 12));
        c.put(new Doll("material", "manufacturer", 2, "name", 67));
        c.put(new Doll("material", "manufacturer", 2, "name", 456));
        c.put(new Transformer("material", "manufacturer", 2, "name", 70));
        c.put(new Transformer("material", "manufacturer", 2, "name", 10));
        c.put(new Transformer("material", "manufacturer", 2, "name", 789));
        c.put(new Transformer("material", "manufacturer", 2, "name", 234));
        c.put(new Transformer("material", "manufacturer", 2, "name", 345));
        c.put(new Transformer("material", "manufacturer", 2, "name", 456));
        c.put(new Transformer("material", "manufacturer", 2, "name", 258));
        c.put(new Transformer("material", "manufacturer", 2, "name", 159));
        c.put(new Transformer("material", "manufacturer", 2, "name", 159));
        c.putAll(newToys);
        System.out.println("не отсортированный");
        c.printContainer();
        c.sortByPrice();
        System.out.println(" ");
        System.out.println("отсортированный");
        c.printContainer();
        System.out.println(" ");
        System.out.println("count");
        System.out.println(c.getCount());
        
        
    }
    
    public static Transformer[] inerTransformers(){
        Transformer[] transformers = new Transformer[5];
        transformers[0] = new Transformer("material", "manufacturer", 5, "name", 100);
        transformers[1] = new Transformer("material", "manufacturer", 5, "name", 200);
        transformers[2] = new Transformer("material", "manufacturer", 5, "name", 100);
        transformers[3] = new Transformer("material", "manufacturer", 5, "name", 200);
        transformers[4] = new Transformer("material", "manufacturer", 5, "name", 400);
        return transformers;
    }
    
    public static Doll[] inerDolls(){
        Doll[] dolls = new Doll[5];
        dolls[0] = new Doll("material", "manufacturer", 3, "name", 30);
        dolls[1] = new Doll("material", "manufacturer", 3, "name", 40);
        dolls[2] = new Doll("material", "manufacturer", 3, "name", 50);
        dolls[3] = new Doll("material", "manufacturer", 3, "name", 60);
        dolls[4] = new Doll("material", "manufacturer", 3, "name", 70);
        return dolls;
    }
}
