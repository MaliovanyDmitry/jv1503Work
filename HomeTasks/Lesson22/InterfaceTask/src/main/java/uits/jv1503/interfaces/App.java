
package uits.jv1503.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    static Bag b = new Bag();
    static FoodProcessor fp = new FoodProcessor();
    static Object[] frutsArr = new Object[20];
    static Object[] vegetableArr = new Object[20];
    /**
    1.корзина с продуктами
    * массив овощей
    * массив фруктов
    * кухонный комбайн
    * 
    * инициализируем корзину
    * создаем кухонный комбайн
    * вытягиваем из корзины все овощи и чистим их
    * чищенные овощи записываем в массив овощей
    * тоже для фруктов
    * производим нарезку
     */
    public static void main(String[] args) throws IOException, Exception {
        
        start();
    
    }
    static Att start() throws IOException, Exception{
        
        Scanner sc = new Scanner(System.in);
       Att a = null;
        System.out.println("Выберите следующее действие:\n"+
                "1-Положить продукт в корзину.\n"
                + "2-Вывести в консоль вес корзины.\n" +
                "3-Вывести в консоль список продуктов, лежащих в корзине.\n" +
                "4-Использовать кухонный комбайн.");
        int x = sc.nextInt();
        switch(x){
            case 1:
                a = putInBag();
                App.b.put(a);
                start();
                break;
            case 2:
                b.summWeight();
                start();
                break;
            case 3:
                b.printBag();
                start();
                break;
            case 4:
                System.out.println("Выберите следующее действие:\n"+
                        "1-Очистить все фрукты.\n"+ 
                        "2-Очистить все овощи.\n" +
                        "3-Нарезать все фрукты.\n" +
                        "4-Нарезать все овощи.\n" + 
                        "5-Нашинковать все фрукты.\n" +
                        "6-Нашинковать все овощи.");
                int y = sc.nextInt();
                switch(y){
                    case 1:
                        frutsArr = fp.peelItems((Att[]) b.extractAllFruits());
                        b.put(frutsArr);
                        start();
                        break;
                    case 2:
                        vegetableArr = fp.peelItems((Att[]) b.extractAllVegetables());
                        b.put(vegetableArr);
                        start();
                        break;
                    case 3:
                        fp.cutAll((Att[]) b.extractAllFruits());
                        start();
                        break;
                    case 4:
                        fp.cutAll((Att[]) b.extractAllVegetables());
                        start();
                        break;
                    case 5:
                        fp.sliceAll((Att[]) b.extractAllFruits());
                        start();
                        break;
                    case 6:
                        fp.sliceAll((Att[]) b.extractAllVegetables());
                        start();
                        break;
                    
                }
        }
        return a;
    }
    static Att putInBag() throws Exception{
        
        Att a = null;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Выберите следующее действие:\n"+
                "1-Положить в корзину яблоки.\n"
                + "2-Положить в корзину бананы.\n" +
                "3-Положить в корзину апельсины.\n" +
                "4-Положить в корзину груши.\n" + 
                "5-Положить в корзину морковь\n"+
                "6-Положить в корзину лук\n"+
                "7-Положить в корзину картошку\n"+
                "8-Положить в корзину сельдерей");
        int x1 = sc1.nextInt();
        switch(x1){
            case 1:
                a = putApple();
                break;
            case 2:
                a = putBanana();
                break;
            case 3:
                a = putOrange();
                break;
            case 4:
                a = putPear();
                break;
            case 5:
                a = putCarrot();
                break;
            case 6:
                a = putOnion();
                break;
            case 7:
                a = putPotatoes();
                break;
            case 8:
                a = putCelery();
                break;
        }
        
        return a;
    }
    static FApple putApple() throws Exception{
        FApple a = new FApple();
        a = (FApple) inicialisation(a);
        return a;
    }
    static FBanana putBanana() throws Exception{
        FBanana b = new FBanana();
        b = (FBanana) inicialisation(b);
        return b;
    }
    static FOrange putOrange() throws Exception{
        FOrange o = new FOrange();
        o = (FOrange) inicialisation(o);
        return o;
    }
    static FPear putPear() throws Exception{
        FPear a = new FPear();
        a = (FPear) inicialisation(a);
        return a;
    }
    static VCarrot putCarrot() throws Exception{
        VCarrot a = new VCarrot();
        a = (VCarrot) inicialisation(a);
        return a;
    }
    static VCelery putCelery() throws Exception{
        VCelery a = new VCelery();
        a = (VCelery) inicialisation(a);
        return a;
    }
    static VOnion putOnion() throws Exception{
        VOnion a = new VOnion();
        a = (VOnion) inicialisation(a);
        return a;
    }
    static VPotatoes putPotatoes() throws Exception{
        VPotatoes a = new VPotatoes();
        a = (VPotatoes) inicialisation(a);
        return a;
    }
    static Att inicialisation(Att a) throws Exception{
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Введите вес продукта.");
        a.weight = sc1.nextDouble();
 
        System.out.println("Введите цвет продукта.");
        a.color = sc1.next();  

        System.out.println("Спелый продукт или нет? y/n");
        String str = sc1.next();   
        if ("y".equals(str)) {
            a.ripeness = true;
        } else if("n".equals(str)){
            a.ripeness = false;  
        } else throw new Exception("Вы ввели не правильное значение.");
        
        System.out.println("Введите качество продукта(от 0 до 10).");
        a.condition = sc1.nextInt();   
        
        System.out.println("Очищен продукт или нет? y/n");
        String str2 = sc1.next();   
        if ("y".equals(str2)) {
            a.peeled = true;
        } else if("n".equals(str2)){
            a.peeled = false;  
        } else throw new Exception("Вы ввели не правильное значение.");
        
        return a;
    }
}
