
package uits.jv1503.lesson11;

public class App {
    
    public static void main(String[] args) {
        
        Computer c1 = new Computer(100, Computer.ComputerType.Laptop, new Drive("Fujitsu", 1000, Drive.driveType.HDD), new RAM("Fujitsu", 90999, RAM.RamType.DDR1));
        System.out.println(c1.toString());
        
    }

    
       
}
