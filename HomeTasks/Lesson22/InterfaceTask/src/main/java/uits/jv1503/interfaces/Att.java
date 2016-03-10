/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1503.interfaces;

import java.util.Scanner;

/**
 *
 * @author Надежда
 */
abstract public class Att {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Scanner sc5 = new Scanner(System.in);
    
    double weight;
    String color;
    boolean ripeness;
    int condition;
    boolean peeled;
    
    void inicialisation() throws Exception{
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите вес продукта.");
        this.weight = sc1.nextDouble();   
        System.out.println("Введите цвет продукта.");
        this.color = sc2.next();   
        System.out.println("Спелый продукт или нет? y/n");
        String str = sc3.next();   
        if ("y".equals(str)) {
            this.ripeness = true;
        } else if("n".equals(str)){
            this.ripeness = false;  
        } else throw new Exception("Вы ввели не правильное значение.");
        System.out.println("Введите качество продукта(от 0 до 10).");
        this.condition = sc4.nextInt();   
        System.out.println("Очищен продукт или нет? y/n");
        String str2 = sc3.next();   
        if ("y".equals(str2)) {
            this.peeled = true;
        } else if("n".equals(str2)){
            this.peeled = false;  
        } else throw new Exception("Вы ввели не правильное значение.");
    }
    
    
}
