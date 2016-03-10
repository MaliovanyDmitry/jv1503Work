
package uits.jv1503.interfaces;

public class VOnion extends Vegetable{

    public VOnion(double weight, String color, boolean ripeness, int condition, boolean peeled) {
        super(weight, color, ripeness, condition, peeled);
    }

    public VOnion() {
        super(0, null, false, 0, false);
    }

    

    @Override
    public void peel() {
        if (!peeled) {
            weight*= 0.95;
            peeled = true;
        }
    }

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
        return "VOnion{" + "weight=" + weight + ", color=" + color + ", ripeness=" + ripeness + ", condition=" + condition + ", peeled=" + peeled + '}';
    }
    
    
    
    
    
    
    
    
    

    
}