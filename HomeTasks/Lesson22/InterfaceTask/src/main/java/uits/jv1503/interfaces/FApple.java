
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
    public String toString() {
        return "FApple{" + "weight=" + weight + ", color=" + color + ", ripeness=" + ripeness + ", condition=" + condition + ", peeled=" + peeled + '}';
    }

    public FApple(double weight, String color, boolean ripeness, int condition, boolean peeled) {
        super(weight, color, ripeness, condition, peeled);
    }
}
