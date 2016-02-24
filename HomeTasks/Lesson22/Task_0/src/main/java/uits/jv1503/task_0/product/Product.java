
package uits.jv1503.task_0.product;

public class Product {
    
    private int id;
    private String productName;
    private long upc;
    private String manufacturer;
    private int price;
    private int storageLife;
    private int number;

    public Product() {
    }

    public Product(int id, String productName, long upc, String manufacturer, int price, int storageLife, int number) {
        this.id = id;
        this.productName = productName;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storageLife = storageLife;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + productName + ", upc=" + upc + ", manufacturer=" + manufacturer + ", price=" + price + ", storageLife=" + storageLife + ", number=" + number + '}';
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public long getUpc() {
        return upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    
}
