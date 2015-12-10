
package uits.jv1503.hometask9;

public class Cars {
    private String name;
    private String color;
    private int weight;

    public Cars(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    Cars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    

    

    
    
    
    
}
