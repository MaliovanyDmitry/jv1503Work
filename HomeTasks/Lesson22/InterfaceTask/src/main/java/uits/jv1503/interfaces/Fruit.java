
package uits.jv1503.interfaces;

abstract public class Fruit extends Plant implements IPeel {
    
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
