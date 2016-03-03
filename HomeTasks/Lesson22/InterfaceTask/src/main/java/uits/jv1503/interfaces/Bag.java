
package uits.jv1503.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        return counter;
    }
    
    public void printBag(){
        System.out.println("На данный момент в корзине лежат: ");
        for (int i = 0; i < bag.length; i++) {
            System.out.println(bag[i]);
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
        for (int i = 0; i < counter; i++) {
            if (bag[i] != null && (bag[i] instanceof Fruit)) {
                array[i] = bag[i];
                bag[i] = null;
            }
        }
        Object[] tempArray = new Object[bag.length];
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < bag.length; j++) {
                if (bag[j]!=null) {
                    tempArray[i] = bag[j];
                   break;
                } 
            }
        }
        bag = tempArray;
        counter = bag.length;
        System.out.println("Вы удалили из корзины: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null)
            System.out.println(array[i]);
        }
        return array;
    }
    
    
    
}
