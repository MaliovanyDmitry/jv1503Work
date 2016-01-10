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
    private List list; 

    public JSONArray() {
        list = new ArrayList<Object>();
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
        String t = "";
        System.out.println(list.size());
        for(final Object o : list){
//            result += o.toString() + ",";
            t += o.toString() + ",";
        }
        System.out.println(t);
        result += t.substring(0, t.length() - 1);
        result+="]";
        return result;
    }
    
    public void put(Object o){
        
        list.add(o);
        
    }
    
   

    
    

    
    
    
}