package uits.jv.javaio;

import java.util.Scanner;



public class ScannerExample {


    /*
        приложение использующее java.util.Scanner для работы с консолью
        позволяет рассмотреть минимальные возможности указанного компонента
    */
    public static void main(String[] args) {
        //consoleReader();
        consoleReadNumbers();
    }
    
    // чтение данных с консоли и интерпретация их в текстовом виде
    public static void consoleReader(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String yourName = null;
        if(sc.hasNext()){
            yourName = sc.nextLine();
        }
        System.out.println("Your name is " + yourName);
    }
    
    // чтение целочисленных данных из консоли
    // производится до тех пор, пока вводимую последовательность можно
    // интерпретировать как int
    // так же имеет ряд методов для ввода других типов данных
    public static void consoleReadNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter integer values");
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
    }
    
    
}
