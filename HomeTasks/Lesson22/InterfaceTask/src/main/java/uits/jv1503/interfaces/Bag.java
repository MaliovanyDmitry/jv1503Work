package uits.jv1503.interfaces;

import java.lang.reflect.Array;

public class Bag {
    private Plant[] bag = new Plant[15];
    private int counter;
    private double weight;
    
    public void  put(Plant o){
        if (counter == bag.length) {
            arrayExpansion();
            bag[counter] = o;
        } else {
            bag[counter] = o;
        }
        weight += o.weight;
        counter ++;
    }    
    
    public void  put(Plant[] o){
        while((bag.length - counter) < o.length){
            arrayExpansion();
        }
        System.arraycopy(o, 0, bag, counter, o.length);
        for (Plant plant : o) {
            weight += plant.weight;
        }
        counter += o.length;    
    }

    public void arrayExpansion(){
            Object[] array = new Object[(3*bag.length)/2];
            System.arraycopy(bag, 0, array, 0, bag.length);
            bag = (Plant[]) array;
    }
    
    public int getCount(){
        return counter;
    }
    
    public void printBag(){
        System.out.println("На данный момент в корзине лежат: ");
        int index = 0;
        while (bag[index] != null) {            
            System.out.println(bag[index]);
            index++;
        }
        System.out.println(" ");
        
    }
    
    public Plant extract(int index){
        Plant temp = (Plant) Array.get(bag, index);
        System.arraycopy(bag, index+1, bag, index, counter);
        weight -= temp.weight;
        counter--;
        return temp;
    }
    
    public Plant[] extractAll(){
        Plant[] array = new Plant[counter];
        for (int i = 0; i < counter; i++) {
            if (bag[i] != null) {
                array[i] = (Plant) bag[i];
                bag[i] = null;
            }
        }
        for (Plant plant : array) {
            weight -= plant.weight;
        }
        counter = 0;

        return (Plant[]) array;
    }
    
    public Plant[] extractAllFruits(){
        Plant[] array = new Plant[counter];
        Bag fruits = new Bag();
        Bag vegetables = new Bag();
        
        for (int i = 0; i < counter; i++) {
            if (bag[i] != null && (bag[i] instanceof Fruit)) {
               fruits.put(bag[i]);
            } else {
                vegetables.put(bag[i]);
            }
        }
        this.bag = vegetables.bag;
        this.counter = vegetables.counter;
        return (Plant[]) fruits.extractAll();
    }
    
    public Plant[] extractAllVegetables(){
        Plant[] array = new Plant[counter];
        Bag fruits = new Bag();
        Bag vegetables = new Bag();
        
        for (int i = 0; i < counter; i++) {
            if (bag[i] != null && (bag[i] instanceof Fruit)) {
               fruits.put(bag[i]);
            } else {
                vegetables.put(bag[i]);
            }
        }
        this.bag = fruits.bag;
        this.counter = fruits.counter;
        return vegetables.extractAll();
    }
    
    public double summWeight(){
        return weight;
    }
}
