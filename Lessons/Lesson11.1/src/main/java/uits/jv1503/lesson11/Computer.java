
package uits.jv1503.lesson11;

public class Computer {
    
    double weight;
    ComputerType type;
    Drive d;
    RAM r;

    public enum ComputerType{
        PC, Laptop, Nettop, Tablet;
    }

    public Computer(double weight, ComputerType type, Drive d, RAM r) {
        this.weight = weight;
        this.type = type;
        this.d = d;
        this.r = r;
    }

    public double getWeight() {
        return weight;
    }

    public ComputerType getType() {
        return type;
    }

    public Drive getD() {
        return d;
    }

    public RAM getR() {
        return r;
    }

    public void setD(Drive d) {
        this.d = d;
    }

    public void setR(RAM r) {
        this.r = r;
    }

    public void setType(ComputerType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "comp[ weight: " + this.weight + " type: " + this.type + " ROM: " + this.r + " Drive: " + this.d + " ]";
    }
    
    
    
    
    
    
    
    

    
    
    
    
    
    
}
