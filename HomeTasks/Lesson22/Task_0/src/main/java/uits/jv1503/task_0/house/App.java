
package uits.jv1503.task_0.house;

public class App {
    public static void main(String[] args) {
        House[] houses = innerHouses();
        getApartmentsForNumberRooms(houses, 3);
        getApartmentsForNumberRoomsFloors(houses, 3, 2, 6);
        getApartmentsForSquare(houses, 60);
    }
    
    public static House[] innerHouses(){
        House[] houses = new House[10];
        houses[0] = new House(0, 12, 60, 3, 3, "streetqqq", "typeOfBuildingbbb", 60);
        houses[1] = new House(1, 67, 56, 3, 3, "streetrrr", "typeOfBuildingmmm", 70);
        houses[2] = new House(2, 43, 78, 8, 3, "streetqqq", "typeOfBuildingbbb", 60);
        houses[3] = new House(3, 68, 45, 6, 2, "streetuuu", "typeOfBuildingmmm", 80);
        houses[4] = new House(4, 89, 47, 5, 2, "streetrrr", "typeOfBuildingvvv", 60);
        houses[5] = new House(5, 43, 50, 4, 2, "streetqqq", "typeOfBuildingbbb", 70);
        houses[6] = new House(6, 52, 34, 2, 1, "streetuuu", "typeOfBuildingmmm", 60);
        houses[7] = new House(7, 80, 39, 1, 1, "streetrrr", "typeOfBuildingvvv", 80);
        houses[8] = new House(8, 90, 79, 4, 4, "streetuuu", "typeOfBuildingbbb", 60);
        houses[9] = new House(9, 51, 90, 7, 4, "streetuuu", "typeOfBuildingvvv", 70);
        return houses;
    }
    
    public static void getApartmentsForNumberRooms(House[] houses, int numberOfRooms){
        System.out.println("a)  список квартир, имеющих заданное число комнат;" + numberOfRooms);
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getNumberOfRooms() == numberOfRooms) {
                System.out.println(houses[i].toString());
            }
        }
    }
    
    public static void getApartmentsForNumberRoomsFloors(House[] houses, int numberOfRooms, int startFloor, int finishFloor){
        System.out.println(" ");
        System.out.println("b)  список квартир, имеющих заданное число комнат и  расположенных \n" +
                            "на этаже, который находится в заданном промежутке;" + numberOfRooms + " " + 
                            startFloor + " " + finishFloor);
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getNumberOfRooms() == numberOfRooms && houses[i].getFloor() >= startFloor && houses[i].getFloor() <= finishFloor) {
                System.out.println(houses[i].toString());
            }
        }
    }
    
    public static void getApartmentsForSquare(House[] houses, int square){
        System.out.println(" ");
        System.out.println("c)  список квартир, имеющих площадь, превосходящую заданную." + square);
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getSqure() > square) {
                System.out.println(houses[i].toString());
            }
        }
    }
}


