
package uits.jv1503.task_0.bus;

public class App {
    public static void main(String[] args) {
        Bus[] buses = inerBuses();
        getBusesByRoutesNumber(buses, 61);
        getBusesByLifetime(buses, 2016, 10);
        getBusesByMileage(buses, 200000);
        
    }
    
    public static Bus[] inerBuses(){
        Bus[] buses = new Bus[10];
        buses[0] = new Bus("qqqdriversName", 563, 40, "qqqbrand", 2000, 100000);
        buses[1] = new Bus("wwwdriversName", 458, 250, "wwwbrand", 2002, 200000);
        buses[2] = new Bus("eeedriversName", 741, 97, "eeebrand", 2005, 300000);
        buses[3] = new Bus("rrrdriversName", 123, 61, "qqqbrand", 2014, 150000);
        buses[4] = new Bus("tttdriversName", 125, 40, "wwwbrand", 1997, 170000);
        buses[5] = new Bus("yyydriversName", 856, 97, "eeebrand", 2007, 230000);
        buses[6] = new Bus("uuudriversName", 965, 250, "qqqbrand", 2003, 250000);
        buses[7] = new Bus("iiidriversName", 852, 61, "wwwbrand", 2000, 310000);
        buses[8] = new Bus("ooodriversName", 321, 40, "eeebrand", 2002, 170000);
        buses[9] = new Bus("pppdriversName", 324, 61, "qqqbrand", 2001, 130000);
        return buses;
    }
    
    public static void getBusesByRoutesNumber(Bus[] buses, int routesNumber){
        System.out.println("a)  список автобусов для заданного номера маршрута;" + routesNumber);
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].getRoutesNumber() == routesNumber) {
                System.out.println(buses[i].toString());
            }
        }
    }
    
    public static void getBusesByLifetime(Bus[] buses, int thisYear, int lifeTime){
        System.out.println(" ");
        System.out.println("b)  список автобусов, которые эксплуатируются больше заданного срока;" + lifeTime);
        for (int i = 0; i < buses.length; i++) {
            if ((thisYear - buses[i].getCommencementOperationYear()) > lifeTime) {
                System.out.println(buses[i].toString());
            }
        }
    }
    
    public static void getBusesByMileage(Bus[] buses, int mileage){
        System.out.println(" ");
        System.out.println("c)  список автобусов, пробег у которых больше заданного расстояния." + mileage);
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].getMileage() > mileage) {
                System.out.println(buses[i].toString());
            }
        }
    }
}
