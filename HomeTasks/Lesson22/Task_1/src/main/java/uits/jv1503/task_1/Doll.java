
package uits.jv1503.task_1;

public class Doll extends Toy{

    private String material;
    private String manufacturer;
    private int minAgeLimit;

    public Doll(String material, String manufacturer, int minAgeLimit, String name, int price) {
        super(name, price);
        this.material = material;
        this.manufacturer = manufacturer;
        this.minAgeLimit = minAgeLimit;
    }
    
    public Doll() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMinAgeLimit() {
        return minAgeLimit;
    }

    public void setMinAgeLimit(int minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    @Override
    public String toString() {
        return "Doll{"+"name=" + name+ ", price=" + price + ", material=" + material + ", manufacturer=" + manufacturer + ", minAgeLimit=" + minAgeLimit  + '}';
    }

    
    
    
}
