/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1503.hometask12;
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