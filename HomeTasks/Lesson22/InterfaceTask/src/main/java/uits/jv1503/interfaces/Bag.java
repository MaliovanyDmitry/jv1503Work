
package uits.jv1503.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bag {
    private Object[] bag = new Object[15];
    private int counter;
    
    
    public void  put(Object o){
        if (counter == bag.length) {
            arrayExpansion();
            bag[counter] = o;
        } else {
            bag[counter] = o;
        }
        counter ++;
    }    
    
    public void  put(Object[] o){
        while((bag.length - counter) < o.length){
            arrayExpansion();
        }
        System.arraycopy(o, 0, bag, counter, o.length);
        counter += o.length;    
    }

    public void arrayExpansion(){
            Object[] array = new Object[(3*bag.length)/2];
            System.arraycopy(bag, 0, array, 0, bag.length);
            bag = array;
    }
    
    public int getCount(){
//        System.out.println(bag[0].toString());
//        System.out.println(bag[0].toString());
//        parseWeight(bag[0]);
        return counter;
    }
    
    public void printBag(){
        System.out.println("На данный момент в корзине лежат: ");
        int index = 0;
        while (bag[index] != null) {            
            System.out.println(bag[index]);
            index++;
        }
        
    }
    
    public Object extract(int index){
        Object temp = Array.get(bag, index);
        System.arraycopy(bag, index+1, bag, index, counter);
        counter--;
        return temp;
    }
    
    public Object[] extractAll(){
        Object[] array = new Object[counter];
        for (int i = 0; i < counter; i++) {
            if (bag[i] != null) {
                array[i] = bag[i];
                bag[i] = null;
            }
        }
        counter = 0;
        System.out.println("Вы удалили из корзины: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
    
    public Object[] extractAllFruits(){
        Object[] array = new Object[counter];
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
        return fruits.extractAll();
    }
    
    public Object[] extractAllVegetables(){
        Object[] array = new Object[counter];
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
    
//    private double parseWeight(Object o){
//        String str = o.toString();
//        int start = str.indexOf("weight=");
//        int end = str.indexOf(",");
//        char buf[] = new char[end - start];
//        str.getChars(start, end, buf, 0);
//        String res = new String(buf);
//        String[] arr = res.split("=");
//        res = arr[1];
//        double doubleRes = Double.valueOf(res);
//        return doubleRes;
        
        
    
//    public double getWeight(){
//        double summ = 0.0;
//        double parsSumm;
//        for (int i = 0; i < bag.length; i++) {
//            if (bag[i]!=null) {
//                parsSumm = parseWeight(bag[i]);
//                summ +=  parsSumm;
//            }
//        }
//        System.out.println("вес корзины: " + summ);
//        return summ;
//    }
    public double getWeight(Att a){
    return a.weight;
    }
    
    public double summWeight(){
        double summWeight = 0.0;
        for (int i = 0; i < counter; i++) {
            
            summWeight +=  getWeight((Att) bag[i]);
            
        }
        System.out.println("вес корзины: " + summWeight);
        return summWeight;
    }

    
    
    
    
}
