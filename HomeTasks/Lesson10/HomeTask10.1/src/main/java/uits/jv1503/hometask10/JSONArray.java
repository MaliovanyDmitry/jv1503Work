
package uits.jv1503.hometask10;

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
    
    public void putAll(String s){
        
        JSONObject j = new JSONObject();
        String[] array = s.split(":");
        String key = array[0];
        String notValue = array[1];
        String[] array2 = notValue.split(",");
            for(Object o : array2)
            j.put(key, list.add(o));
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
