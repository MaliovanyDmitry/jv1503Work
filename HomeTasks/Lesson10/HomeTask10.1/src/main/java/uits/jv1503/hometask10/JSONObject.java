
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
    public void put(String stringJSONobj){
    
    String[] array = stringJSONobj.split(":");
    String notKey1 = array[0];
    String notValue1 = array[1];

    String key1 ="\""+ notKey1.replaceAll("\\{","") + "\"";
    String value1 = notValue1.replaceAll("\\}","");
    String value2 = value1.replaceAll("\"","");
    String value = value2.replaceAll(" ","");
    values.put(key1, value);
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
                    }else{
                        if(entry.getValue() instanceof JSONArray){
                            res += entry.getValue() + ", ";
                        }
                    }
                }
            }
        }
        res = res.substring(0, res.length()-2);
        res += "}";
        return res;
    }
}
    
    
    
     




    
    
    

