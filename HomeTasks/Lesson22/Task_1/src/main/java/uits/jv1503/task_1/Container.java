
package uits.jv1503.task_1;

public class Container {
    
    private Toy[] toys = new Toy[15];
    private int counter;
    
    public Container() {
    }
    
    public void put(Toy toy){
        if (counter == toys.length) {
            arrayExpansion();
            toys[counter] = toy;
        } else {
            toys[counter] = toy;
        }
        counter ++;
    }
    
    public int getCount(){
        System.out.println(counter);
        return counter;
    }
    
    public  Toy getByIndex(int index){
       return toys[index];
    }
    
    public void sortByPrice(){
        for (int j = 0; j < counter-1; j++) {
            for (int i = j + 1; i < counter; i++) { 
                if (toys[j].getPrice() > toys[i].getPrice()) { 
                    Object temp = toys[j];
                    toys[j] = toys[i];
                    toys[i] = (Toy) temp;
                } 
            }  
        }
    }
    
    public void printContainer(){
        for (int i = 0; i < toys.length; i++) {
            System.out.println(toys[i]);
        }
    }
    
    public void arrayExpansion(){
            Toy[] t = new Toy[(3*toys.length)/2];
            System.arraycopy(toys, 0, t, 0, toys.length);
            toys = t;
    }

    public void putAll(Toy[] newToys){
        while((toys.length - counter) < newToys.length){
            arrayExpansion();
        }
        System.arraycopy(newToys, 0, toys, counter, newToys.length);
        counter += newToys.length;    
    }
}
