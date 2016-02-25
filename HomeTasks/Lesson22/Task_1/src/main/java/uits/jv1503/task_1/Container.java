
package uits.jv1503.task_1;

public class Container {
    
    private Toy[] toys = new Toy[15];
    private int counter;
    
    public Container() {
    }
    
    public void put(Toy toy){
        if (counter == toys.length) {
            Toy[] t = new Toy[counter+1];
            System.arraycopy(toys, 0, t, 0, toys.length);
            t[counter] = toy;
            toys = t;
        } else {
            toys[counter] = toy;
        }
        counter ++;
    }
    
    public int getCount(){
        return counter;
    }
    
    public  Toy getByIndex(int index){
       return toys[index];
    }
    
    public void sortByPrice(){
        for (int j = 0; j < toys.length; j++) {
            for (int i = j + 1; i < toys.length; i++) { 
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


    

    
    
    
}
