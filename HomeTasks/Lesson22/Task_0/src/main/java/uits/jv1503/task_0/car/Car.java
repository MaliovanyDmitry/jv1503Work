
package uits.jv1503.task_0.car;

public class Car {
    
    private int id;
    private String brand;
    private String model;
    private int yearIssue;
    private String color;
    private int price;
    private int registrationNumber;

    public Car() {
    }

    public Car(int id, String brand, String model, int yearIssue, String color, int price, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearIssue = yearIssue;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", yearIssue=" + yearIssue + ", color=" + color + ", price=" + price + ", registrationNumber=" + registrationNumber + '}';
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    
    
}
