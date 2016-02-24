
package uits.jv1503.task_0.train;

public class Train {
    
    //10. Train: Пункт назначения, Номер поезда, Время отправления, Число мест 
//(общих, купе, плацкарт, люкс).
    private String destination;
    private int trainNumber;
    private int departureTime;
    private int generalSeatsNumber;
    private int compartmentSeatsNumber;
    private int accomodationSeatsNumber;
    private int luxSeatsNumber;

    public Train() {
    }

    public Train(String destination, int trainNumber, int departureTime, int generalSeatsNumber, int compartmentSeatsNumber, int accomodationSeatsNumber, int luxSeatsNumber) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.generalSeatsNumber = generalSeatsNumber;
        this.compartmentSeatsNumber = compartmentSeatsNumber;
        this.accomodationSeatsNumber = accomodationSeatsNumber;
        this.luxSeatsNumber = luxSeatsNumber;
    }

    @Override
    public String toString() {
        return "Train{" + "destination=" + destination + ", trainNumber=" + trainNumber + ", departureTime=" + departureTime + ", generalSeatsNumber=" + generalSeatsNumber + ", compartmentSeatsNumber=" + compartmentSeatsNumber + ", accomodationSeatsNumber=" + accomodationSeatsNumber + ", luxSeatsNumber=" + luxSeatsNumber + '}';
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getGeneralSeatsNumber() {
        return generalSeatsNumber;
    }

    public int getCompartmentSeatsNumber() {
        return compartmentSeatsNumber;
    }

    public int getAccomodationSeatsNumber() {
        return accomodationSeatsNumber;
    }

    public int getLuxSeatsNumber() {
        return luxSeatsNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void setGeneralSeatsNumber(int generalSeatsNumber) {
        this.generalSeatsNumber = generalSeatsNumber;
    }

    public void setCompartmentSeatsNumber(int compartmentSeatsNumber) {
        this.compartmentSeatsNumber = compartmentSeatsNumber;
    }

    public void setAccomodationSeatsNumber(int accomodationSeatsNumber) {
        this.accomodationSeatsNumber = accomodationSeatsNumber;
    }

    public void setLuxSeatsNumber(int luxSeatsNumber) {
        this.luxSeatsNumber = luxSeatsNumber;
    }
    
    
    
    
}
