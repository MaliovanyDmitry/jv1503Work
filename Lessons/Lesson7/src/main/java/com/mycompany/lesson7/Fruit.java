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
public class Fruit {
    
    String color;
    private double weight;
    String taste;
    
    public Fruit(){
        color = "green";
        weight = 0.125;
        taste = "unknown";
    }
    
    public Fruit(double weight){
       color = "green";
       taste = "unknown";
       this.weight = weight;
    }
     
    public Fruit(double weight, String color){
       this.color = color;
       taste = "unknown";
       this.weight = weight;
     }
     
    public double getWeight(){//возвращает значение
       return this.weight;
     }
    
    public void setWeight(double weight){//изменяет значение
        
        if (weight>=0.02 && weight<=10){
            this.weight = weight;
        }
        else System.out.println("большой фрукт");
        
    }
     
}
