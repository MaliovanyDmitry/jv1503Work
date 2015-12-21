
package uits.jv1503.hometask10;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {
    
private HashMap<String, Object> values; 
    
    public JSONObject(){
        values = new HashMap();
    }
    public void put(String key, Object value){
        values.put(key, value);
    }
    
    public String getJSONString(){
        String res = "{";
        for(Map.Entry entry: values.entrySet()){
            res += entry.getKey()+ ":"; 
            if(entry.getValue() instanceof String){
               res += ("\"" + entry.getValue() + "\", ");
            }else{
                if(entry.getValue() instanceof Integer){
                    res += (entry.getValue() + ", ");
                }else{
                    if(entry.getValue() instanceof JSONObject){
                       res += ((JSONObject)entry.getValue()).getJSONString() + ", "; 
                    }
                }
            }
        }
        res = res.substring(0, res.length()-2);
        res += "}";
        return res;
    }
}
    
    
    
     




    
    
    

