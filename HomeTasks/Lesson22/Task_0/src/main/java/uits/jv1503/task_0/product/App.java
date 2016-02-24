
package uits.jv1503.task_0.product;

public class App {
    public static void main(String[] args) {
        Product[] products = inerProducts();
        getProductsByName(products, "wwwproductName");
        getProductsByNamePrice(products, "qqqproductName", 30);
        getProductsByStorageLife(products, 100);
    }
    
    public static Product[] inerProducts(){
        Product[] products = new Product[10];
        products[0] = new Product(0, "qqqproductName", 125636588741L, "rrrmanufacturer", 20, 356, 100);
        products[1] = new Product(1, "wwwproductName", 456987412563L, "tttmanufacturer", 69, 100, 200);
        products[2] = new Product(2, "eeeproductName", 456321588741L, "yyymanufacturer", 54, 36, 500);
        products[3] = new Product(3, "qqqproductName", 789636588741L, "rrrmanufacturer", 100, 12, 400);
        products[4] = new Product(4, "wwwproductName", 458712588741L, "tttmanufacturer", 67, 5, 200);
        products[5] = new Product(5, "eeeproductName", 325636588741L, "yyymanufacturer", 21, 600, 100);
        products[6] = new Product(6, "qqqproductName", 215636588741L, "rrrmanufacturer", 5, 30, 500);
        products[7] = new Product(7, "wwwproductName", 128736588741L, "tttmanufacturer", 58, 356, 400);
        products[8] = new Product(8, "eeeproductName", 781236588741L, "yyymanufacturer", 13, 20, 600);
        products[9] = new Product(9, "qqqproductName", 983236588741L, "rrrmanufacturer", 88, 5, 300);
        return products;
    }
    
    public static void getProductsByName(Product[] products, String productName){
        System.out.println("a)  список товаров для заданного наименования;" + productName);
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(productName)) {
                System.out.println(products[i].toString());
            }
        }
    }
    
    public static void getProductsByNamePrice(Product[] products, String productName, int price){
        System.out.println(" ");
        System.out.println("b)  список товаров для заданного наименования, цена которых не превос-ходит заданную;" + productName + " " + price);
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(productName) && products[i].getPrice() <= price) {
                System.out.println(products[i].toString());
            }
        }
    }
    
    public static void getProductsByStorageLife(Product[] products, int storageLife){
        System.out.println(" ");
        System.out.println("c)  список товаров, срок хранения которых больше заданного" + storageLife);
        for (int i = 0; i < products.length-1; i++) {
            if (products[i].getStorageLife() > storageLife) {
                System.out.println(products[i].toString());
            }
        }
    }
    
    
    
}
