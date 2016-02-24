
package uits.jv1503.task_0.airline;

import java.util.Arrays;

public class Airline {
    
    private String destination;
    private int flightNumber;
    private String flightTypes;
    private int departureTime;
    private String[] weekDay;

    public Airline() {
    }

    public Airline(String destination, int flightNumber, String flightTypes, int departureTime, String[] weekDay) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightTypes = flightTypes;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Airline{" + "destination=" + destination + ", flightNumber=" + flightNumber + ", flightTypes=" + flightTypes + ", departureTime=" + departureTime + ", weekDay=" + Arrays.toString(weekDay) + '}';
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getFlightTypes() {
        return flightTypes;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public String[] getWeekDay() {
        return weekDay;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightTypes(String flightTypes) {
        this.flightTypes = flightTypes;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void setWeekDay(String[] weekDay) {
        this.weekDay = weekDay;
    }
    
    
    
}
