package uits.jv1503.interfaces;

import java.io.IOException;
import java.util.Scanner;

public class App {
    static Bag b = new Bag();
    static FoodProcessor fp = new FoodProcessor();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, Exception {
        start();
    }
    static void start() throws IOException, Exception{
        boolean finish = false;
        while(!finish){
            System.out.println("Выберите следующее действие:\n"+
                    "1-Положить продукт в корзину.\n"+ 
                    "2-Вывести в консоль вес корзины.\n" +
                    "3-Вывести в консоль список продуктов, лежащих в корзине.\n" +
                    "4-Использовать кухонный комбайн.\n"+
                    "0-Для выхода.");
            int operation;
            try{
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 0:{
                        finish = true;
                    }break;
                    case 1:{
                        putInBag();
                    }break;
                    case 2:{
                        printBagWeight();
                    }break;
                    case 3:{
                        b.printBag();
                    }break;
                    case 4:{
                        useFoodMachine();
                    }break;
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            }catch(Exception ex){
                System.out.println("Неверный код операции, повторите снова.");
            }
        }
    }
    
    static void useFoodMachine(){
        while(true){
            System.out.println("Выберите следующее действие:\n"+
                        "1-Очистить все фрукты.\n"+ 
                        "2-Очистить все овощи.\n" +
                        "3-Нарезать все фрукты.\n" +
                        "4-Нарезать все овощи.\n" + 
                        "5-Нашинковать все фрукты.\n" +
                        "6-Нашинковать все овощи.\n" +
                        "0-Для выхода");
            int operation;
            try {
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 0:{
                        return;
                    }
                    case 1:{
                        b.put(fp.peelItems(b.extractAllFruits()));
                    }break;
                    case 2:{
                        b.put(fp.peelItems(b.extractAllVegetables()));
                    }break;
                    case 3:{
                        fp.cutAll(b.extractAllFruits());
                    }break;
                    case 4:{
                        fp.cutAll(b.extractAllVegetables());
                    }break;
                    case 5:{
                        fp.sliceAll(b.extractAllFruits());
                    }break;
                    case 6:{
                        fp.sliceAll(b.extractAllVegetables());
                    }break;
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Неверный код операции, повторите снова.");
            }
        }
    }
    
    static void putInBag() throws Exception{
        boolean finish = false;
        do{
            System.out.println("Выберите следующее действие:\n"+
                "1-Положить в корзину яблоки.\n"+ 
                "2-Положить в корзину бананы.\n" +
                "3-Положить в корзину апельсины.\n" +
                "4-Положить в корзину груши.\n" + 
                "5-Положить в корзину морковь\n"+
                "6-Положить в корзину лук\n"+
                "7-Положить в корзину картошку\n"+
                "8-Положить в корзину сельдерей\n"+
                "0-Для выхода.");
            int operation;
            try{
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 0:{
                        finish = true;
                    }break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:{
                        b.put((Plant) init(operation));
                    }break;
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            }catch(Exception ex){
                System.out.println("Неверный код операции, повторите снова.");
            }
        }while(!finish);
    }
    
    static IPeel init(int operation) throws Exception{
        double weight;
        while(true){
            System.out.println("Введите вес продукта.");
            try {
                weight = Double.parseDouble(sc.next());
                break;
            } catch (Exception e) {
                System.out.println("Введено неверное значение, повторите снова.");
            }
        }
        
        String color;
        while(true){
            System.out.println("Введите цвет продукта.");
                color = sc.next();
                break;
        }
        
        boolean ripeness;
        while(true){
            System.out.println("Спелый продукт или нет? y/n");
            try {
                String t = sc.next();
                if ("y".equalsIgnoreCase(t)) {
                    ripeness = true;
                    break;
                } else if ("n".equalsIgnoreCase(t)){
                    ripeness = false;
                    break;
                } else
                    System.out.println("Введено неверное значение, повторите снова.");
            } catch (Exception e) {
                System.out.println("Введено неверное значение, повторите снова.");
            }
        }
        
        int condition;
        while(true){
            System.out.println("Введите качество продукта(от 0 до 10).");
            try {
                condition = Integer.parseInt(sc.next());
                if (condition >= 0 && condition <= 10) {
                    break;
                } else {
                   System.out.println("Введено неверное значение, повторите снова."); 
                }
            } catch (Exception e) {
                System.out.println("Введено неверное значение, повторите снова.");
            }
        }
        
        switch(operation){
            case 1:{
                return new FApple(weight, color, ripeness, condition, false);
            }
            case 2:{
                return new FBanana(weight, color, ripeness, condition, false);
            }
            case 3:{
                return new FOrange(weight, color, ripeness, condition, false);
            }
            case 4:{
                return new FPear(weight, color, ripeness, condition, false);
            }
            case 5:{
                return new VCarrot(weight, color, ripeness, condition, false);
            }
            case 6:{
                return new VOnion(weight, color, ripeness, condition, false);
            }
            case 7:{
                return new VPotatoes(weight, color, ripeness, condition, false);
            }
            case 8:{
                return new VCelery(weight, color, ripeness, condition, false);
            }
        }
        return null;
    }
    
    static void printBagWeight(){
        System.out.println("Вес корзины составляет: " + b.summWeight());
    }
}
