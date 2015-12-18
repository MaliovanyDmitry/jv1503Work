
package uits.jv1503.hometask10;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {
    
private String key;
private String s1;
private String string = null;
private Object o1;    
    
    public JSONObject(String key, String s1) {
        this.key = key;
        this.s1 = s1;
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put(key, s1);
        //this.string = "";
        for (Map.Entry f1: hashmap.entrySet()){
            this.string = ("\"" + f1.getKey() + "\":" + "\"" + f1.getValue() + "\"");
    }
        System.out.println(string);
    }

    public JSONObject(String key, Object o1) {
        this.key = key;
        this.o1 = o1;
        Map<String, Object> hashmap = new HashMap<String, Object>();
        hashmap.put(key, s1);
        for (Map.Entry f1: hashmap.entrySet()){
            this.string = ("\"" + f1.getKey() + "\":" + "\"" + f1.getValue() + "\"");
        }
        System.out.println(string);
    }
}
    
    
    
     




    
    
    

