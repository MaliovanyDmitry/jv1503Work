
package uits.jv1503.task_0.bus;

public class Bus {
    
    private String driversName;
    private int busNumber;
    private int routesNumber;
    private  String brand;
    private int commencementOperationYear;
    private int mileage;

    public Bus() {
    }

    public Bus(String driversName, int busNumber, int routesNumber, String brand, int commencementOperationYear, int mileage) {
        this.driversName = driversName;
        this.busNumber = busNumber;
        this.routesNumber = routesNumber;
        this.brand = brand;
        this.commencementOperationYear = commencementOperationYear;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" + "driversName=" + driversName + ", busNumber=" + busNumber + ", routesNumber=" + routesNumber + ", brand=" + brand + ", commencementOperationYear=" + commencementOperationYear + ", mileage=" + mileage + '}';
    }

    public String getDriversName() {
        return driversName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getRoutesNumber() {
        return routesNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getCommencementOperationYear() {
        return commencementOperationYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setRoutesNumber(int routesNumber) {
        this.routesNumber = routesNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCommencementOperationYear(int commencementOperationYear) {
        this.commencementOperationYear = commencementOperationYear;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    
    
    
    
}
