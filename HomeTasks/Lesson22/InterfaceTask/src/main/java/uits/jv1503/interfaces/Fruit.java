
package uits.jv1503.interfaces;

abstract public class Fruit implements IPeel{
    
    protected double weight;
    protected String color;
    protected boolean ripeness;
    protected int condition;
    protected boolean peeled;

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isRipeness() {
        return ripeness;
    }

    public int getCondition() {
        return condition;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRipeness(boolean ripeness) {
        this.ripeness = ripeness;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }

    @Override
    public String toString() {
        return "Fruit{" + "weight=" + weight + ", color=" + color + ", ripeness=" + ripeness + ", condition=" + condition + ", peeled=" + peeled + '}';
    }

    public Fruit(double weight, String color, boolean ripeness, int condition, boolean peeled) {
        this.weight = weight;
        this.color = color;
        this.ripeness = ripeness;
        this.condition = condition;
        this.peeled = peeled;
    }
    
    
    

    

    

    
    
    

}
