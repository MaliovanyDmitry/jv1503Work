/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1503.hometask12;



import java.util.ArrayList;




public class JSONParser {
    

    static JSONObject parseObject(String s)throws Exception{
        JSONObject newObject = new JSONObject();
        s=s.trim();
        if(!s.startsWith("{") && !s.endsWith("}")){
            throw new Exception("ERROR MOTHERFUCKERS!!!!!");
        }
        String[] parts = s.substring(1, s.length()-2).split(",");
        int current = 0;
        while(current < parts.length){
            String currentPart = parts[current];
            // trim
            //starts with " ? ok : error
            currentPart = currentPart.trim();
            if(!currentPart.startsWith("\"")){



                throw new Exception("ERROR MOTHERFUCKERS!!!!!");
            }
            String[] subParts = currentPart.split(":");
            if(subParts.length != 2){
                throw new Exception("ERROR MOTHERFUCKERS!!!!!");
            }
            
            if(!subParts[0].startsWith("\"") &&!subParts[0].endsWith("\"")){
                throw new Exception("invalid format, missing \"");
            }
            
            String key;
            //для парсинга ключа
            //берем подстроку из ключа без кавычек и проверяем длину
            //если длина = 0 - ошибка, пустой ключ
            //иначе записываем ключ
            key = subParts[0].substring(1, subParts[0].length()-2);
            if ((key.substring(1, key.length()-2)).length() == 0){
                throw new Exception("this key is NULL");
            } 
            
            
            Object value = null;
            switch(subParts[1].charAt(0)){
                case '{' :{
                    //парсим как жсон объект
                    value = (Object)parseObject(subParts[1]);
                    
                }break;
                case '[': {
                    value = (Object)parseJSONArray(subParts[1]);
                 
                }break;
                case '"' : {
            
                    if(!validatePart(subParts[1].substring(1, subParts[0].length()-2)))
                        throw new Exception("invalid format, missing \"");
                    value = subParts[1].substring(1, subParts[0].length()-2);
                    
                }
            }
            
            
            newObject.put(key, value);
            current+=1;
        }
        return newObject;
    }
    
    public static JSONArray parseJSONArray(String s)throws Exception{
        if(!s.startsWith("[") && !s.endsWith("]")){
            throw new Exception("this construction is not array");  
        }
        s = s.trim().substring(1, s.length()-2);
        String [] arr = s.split(",");
        
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i].trim();
            if (arr[i].length()==0) {
                throw new Exception("this array is invalid"); 
            }
            if(arr[i].charAt(0)>='0' && arr[i].charAt(0)<='9'){
                if(".".indexOf(arr[i]) < 0){
                    
                }
            }
       
            
        
        return array;
    }
        
    

        
    
    
    public static boolean validatePart(String part){
        //boolean valid = true;
        
        //проверка на начало с " и конец "
        char[] chars = part.substring(1, part.length()-2).toCharArray();
        boolean hasChar = false;
        for(final char c : chars){
            if(c >= ' '){
                hasChar = true;
            }
            if(",:]}/\\\"[{;=#".indexOf(c) < 0){
                return false;
            }  
        }
        return hasChar;
    }
    
}