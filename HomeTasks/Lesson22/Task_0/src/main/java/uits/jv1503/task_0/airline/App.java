
package uits.jv1503.task_0.airline;

public class App {
    public static void main(String[] args) {
        Airline[] airlines = inerAirlines();
        getAirlinesByDestination(airlines, "qqqdestination");
        getAirlinesByWeekday(airlines, "Sunday");
        getAirlinesByWeekdayDTime(airlines, "Monday", 10);
    }
    
    public static Airline[] inerAirlines(){
        Airline[] airlines = new Airline[10];
        airlines[0] = new Airline("qqqdestination", 347, "flightTypes", 9, new String[]{"Monday", "Wednesday", "Saturday"});
        airlines[1] = new Airline("wwwdestination", 658, "flightTypes", 21, new String[]{"Tuesday", "Friday", "Sunday"});
        airlines[2] = new Airline("eeedestination", 741, "flightTypes", 12, new String[]{"Monday", "Wednesday", "Saturday"});
        airlines[3] = new Airline("qqqdestination", 852, "flightTypes", 17, new String[]{"Tuesday", "Friday", "Sunday"});
        airlines[4] = new Airline("wwwdestination", 963, "flightTypes", 5, new String[]{"Monday", "Wednesday", "Saturday"});
        airlines[5] = new Airline("eeedestination", 123, "flightTypes", 2, new String[]{"Tuesday", "Friday", "Sunday"});
        airlines[6] = new Airline("qqqdestination", 321, "flightTypes", 19, new String[]{"Monday", "Wednesday", "Saturday"});
        airlines[7] = new Airline("wwwdestination", 456, "flightTypes", 14, new String[]{"Tuesday", "Friday", "Sunday"});
        airlines[8] = new Airline("eeedestination", 654, "flightTypes", 8, new String[]{"Monday", "Wednesday", "Saturday"});
        airlines[9] = new Airline("qqqdestination", 987, "flightTypes", 13, new String[]{"Tuesday", "Friday", "Sunday"});
        return airlines;
    }
    
    public static void getAirlinesByDestination(Airline[] airlines, String destination){
        System.out.println("a)  список рейсов для заданного пункта назначения;" + destination);
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                System.out.println(airlines[i].toString());
            }
        }
    }
    
    public static void getAirlinesByWeekday(Airline[] airlines, String weekday){
        System.out.println(" ");
        System.out.println("b)  список рейсов для заданного дня недели;" + weekday);
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j <= 2; j++) {
                if (airlines[i].getWeekDay()[j].equals(weekday)) {
                    System.out.println(airlines[i].toString());
                }
            }
        }
    }
    
    public static void getAirlinesByWeekdayDTime(Airline[] airlines, String weekday, int departyreTime){
        System.out.println(" ");
        System.out.println("c)  список рейсов для заданного дня недели, время вылета для которых больше заданного." + weekday + " " + departyreTime);
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j <= 2; j++) {
                if (airlines[i].getWeekDay()[j].equals(weekday) && airlines[i].getDepartureTime() > departyreTime) {
                    System.out.println(airlines[i].toString());
                }
            }
        }
    }
    
    
}
