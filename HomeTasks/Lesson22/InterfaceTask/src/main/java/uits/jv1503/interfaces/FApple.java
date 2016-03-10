
package uits.jv1503.interfaces;

public class FApple extends Fruit{

    @Override
    public void peel() {
        if (!peeled) {
            weight*= 0.95;
            peeled = true;
        }
    }

    @Override
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
        return "FApple{" + "weight=" + weight + ", color=" + color + ", ripeness=" + ripeness + ", condition=" + condition + ", peeled=" + peeled + '}';
    }

    

    public FApple(double weight, String color, boolean ripeness, int condition, boolean peeled) {
        super(weight, color, ripeness, condition, peeled);
    }

    public FApple() {
        super(0, null, false, 0, false);
    }
    
    
    

    
    

    
    
    

    

    

    

    
    
    
    
    
    
}
