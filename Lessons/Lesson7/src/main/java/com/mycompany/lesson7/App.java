/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson7;

/**
 *
 * @author Надежда
 */
public class App {
    public static void main(String[] args) {
        
        Fruit f1;
        Fruit f2;
        Fruit f3;
        
        f1=new Fruit();
        f2=new Fruit(0.3);
        f3=new Fruit(300,"green");
        f3.setWeight(300);
        
        System.out.println(f1.getWeight());
        
        
        
    }
    
}

