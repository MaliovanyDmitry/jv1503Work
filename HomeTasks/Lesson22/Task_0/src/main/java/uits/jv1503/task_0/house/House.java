
package uits.jv1503.task_0.house;

public class House {
    
    private int id;
    private int apartmentNumber;
    private int squre;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String typeOfBuilding;
    private int lifetime;

    public House() {
    }

    public House(int id, int apartmentNumber, int squre, int floor, int numberOfRooms, String street, String typeOfBuilding, int lifetime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.squre = squre;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", apartmentNumber=" + apartmentNumber + ", squre=" + squre + ", floor=" + floor + ", numberOfRooms=" + numberOfRooms + ", street=" + street + ", typeOfBuilding=" + typeOfBuilding + ", lifetime=" + lifetime + '}';
    }

    public int getId() {
        return id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getSqure() {
        return squre;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setSqure(int squre) {
        this.squre = squre;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
    
    
}
