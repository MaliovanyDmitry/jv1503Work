
package uits.jv1503.task_0.train;

public class App {
    public static void main(String[] args) {
        Train[] trains = inerTrains();
        getTrainsBydestination(trains, "qqqdestination");
        getTrainsBydestinationDTyme(trains, "qqqdestination", 9);
        getTrainsBydestinationGeneralSN(trains, "qqqdestination");
        
    }
    
    public static Train[] inerTrains(){
        Train[] trains = new Train[10];
        trains[0] = new Train("qqqdestination", 343, 9, 100, 80, 15, 10);
        trains[1] = new Train("wwwdestination", 56, 22, 130, 100, 30, 10);
        trains[2] = new Train("eeedestination", 125, 13, 0, 120, 20, 10);
        trains[3] = new Train("qqqdestination", 365, 24, 200, 180, 15, 10);
        trains[4] = new Train("wwwdestination", 89, 3, 120, 100, 20, 10);
        trains[5] = new Train("eeedestination", 62, 15, 300, 230, 15, 10);
        trains[6] = new Train("qqqdestination", 47, 12, 0, 150, 15, 10);
        trains[7] = new Train("wwwdestination", 204, 19, 250, 350, 30, 10);
        trains[8] = new Train("eeedestination", 84, 5, 0, 40, 40, 10);
        trains[9] = new Train("qqqdestination", 12, 7, 0, 250, 35, 10);
        return trains;
    }
    
    public static void getTrainsBydestination(Train[] trains, String destination){
        System.out.println("список поездов следующих до заданного пункта назначения" + destination);
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getDestination().equals(destination)) {
                System.out.println(trains[i].toString());
            }
        }
    }
    
    public static void getTrainsBydestinationDTyme(Train[] trains, String destination, int departureTime){
        System.out.println(" ");
        System.out.println("b)  список поездов, следующих до заданного пункта назначения и отправ-ляющихся "
                + "после заданного часа;" + destination + " "+departureTime);
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getDestination().equals(destination) && trains[i].getDepartureTime() > departureTime) {
                System.out.println(trains[i].toString());
            }
        }
    }
    
    public static void getTrainsBydestinationGeneralSN(Train[] trains, String destination){
        System.out.println(" ");
        System.out.println("c)  список поездов, отправляющихся до  заданного пункта назначения \n" +
                             "и имеющих общие места." + destination );
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getDestination().equals(destination) && trains[i].getGeneralSeatsNumber() > 0) {
                System.out.println(trains[i].toString());
            }
        }
    }
    
    
}
