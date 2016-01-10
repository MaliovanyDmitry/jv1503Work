/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1503.hometask12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JSONArray {
    private ArrayList list; 

    public JSONArray() {
        list = new ArrayList();
    }
    public JSONArray (Object[] arr){
        list = new ArrayList();
        for(Object o : arr){
            list.add(o);
        }
    }
    public JSONArray (int[] arr){
        list = new ArrayList();
        for(Object o : arr){
            list.add(o);
        }
    }
    
    public void putAll(ArrayList arr){
        for(Object o : arr)
            list.add(o);
    }
    
    public void putAll(int[] a){
        for(int x : a){
            list.add(x);
        }
    }
    
    public String toString(){
        String result = "[";
        for(final Object o : list){
            result += o.toString() + ",";
        }
        result = result.substring(0, result.length() - 1);
        result+="]";
        return result;
    }
    
   

    
    

    
    
    
}