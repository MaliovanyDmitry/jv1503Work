
package uits.jv1503.task_1;

public class Toy {
    
    String name;
    int price;
    
    public Toy() {
    }

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public static void printAveragePrice(Toy[] toy){
        int averagePrice = 0;
        for (int i = 0; i < toy.length; i++) {
            averagePrice += toy[i].getPrice();
        }
        System.out.println("Средняя цена товара " + toy.getClass() + " = " + (averagePrice/toy.length));
    }
    
    @Override
    public String toString() {
        return "Toy{" + "name=" + name + ", price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}
