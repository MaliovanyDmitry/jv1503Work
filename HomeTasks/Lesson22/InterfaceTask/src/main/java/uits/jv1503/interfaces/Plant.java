
package uits.jv1503.interfaces;

abstract public class Plant {
    double weight;
    String color;
    boolean ripeness;
    int condition;
    boolean peeled;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRipeness() {
        return ripeness;
    }

    public void setRipeness(boolean ripeness) {
        this.ripeness = ripeness;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }
}
