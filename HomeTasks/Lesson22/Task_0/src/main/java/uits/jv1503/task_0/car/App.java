
package uits.jv1503.task_0.car;

public class App {
    
    public static void main(String[] args) {
        Car[] cars = inerCars();
        getCarsByBrend(cars, "wwwbrand");
        getCarsByModelLifetime(cars, "tttmodel", 2015, 5);
        getCarsByYearIssuePrice(cars, 2015, 300000);
    }
    
    public static Car[] inerCars(){
        Car[] cars = new Car[10];
        cars[0] = new Car(0, "qqqbrand", "rrrmodel", 2015, "uuucolor", 100000, 96857541);
        cars[1] = new Car(1, "wwwbrand", "tttmodel", 2015, "iiicolor", 150000, 94521241);
        cars[2] = new Car(2, "eeebrand", "yyymodel", 2010, "ooocolor", 180000, 45897541);
        cars[3] = new Car(3, "qqqbrand", "rrrmodel", 2005, "uuucolor", 200000, 45217541);
        cars[4] = new Car(4, "wwwbrand", "tttmodel", 2005, "iiicolor", 500000, 98567541);
        cars[5] = new Car(5, "eeebrand", "yyymodel", 2010, "ooocolor", 450000, 32567541);
        cars[6] = new Car(6, "qqqbrand", "rrrmodel", 2005, "uuucolor", 350000, 78967541);
        cars[7] = new Car(7, "wwwbrand", "tttmodel", 2005, "iiicolor", 300000, 63257541);
        cars[8] = new Car(8, "eeebrand", "yyymodel", 2015, "ooocolor", 250000, 21895415);
        cars[9] = new Car(9, "qqqbrand", "rrrmodel", 2015, "uuucolor", 400000, 32877541);
        return cars;
    }
    
    public static void getCarsByBrend(Car[] cars, String brand){
        System.out.println("a)список автомобилей заданной марки;" + brand);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(brand)) {
                System.out.println(cars[i].toString());
            }
        }
    }
    
    public static void getCarsByYearIssuePrice(Car[] cars, int yearIssue, int price){
        System.out.println(" ");
        System.out.println("c)  список автомобилей заданного года выпуска, цена которых больше ука-занной." + yearIssue + " " + price);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearIssue() == yearIssue && cars[i].getPrice() > price) {
                System.out.println(cars[i].toString());
            }
        }
    }
    
    public static void getCarsByModelLifetime(Car[] cars, String model, int thisYear, int lifetime){
        System.out.println(" ");
        System.out.println("b)список автомобилей заданной модели, которые эксплуатируются больше n-лет;" + model + " " + lifetime);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equals(model) && (thisYear - cars[i].getYearIssue())>lifetime ) {
                System.out.println(cars[i].toString());
            }
        }
    }
    
}
