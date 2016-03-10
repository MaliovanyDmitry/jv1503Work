
package uits.jv1503.interfaces;



abstract public class Vegetable extends Plant implements IPeel{

    public Vegetable(double weight, String color, boolean ripeness, int condition, boolean peeled) {
        this.weight = weight;
        this.color = color;
        this.ripeness = ripeness;
        this.condition = condition;
        this.peeled = peeled;
    }

    @Override
    public String toString() {
        return "Vegetable{" + "weight=" + weight + ", color=" + color + ", ripeness=" + ripeness + ", condition=" + condition + ", peeled=" + peeled + '}';
    }
}
