/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1503.hometask12;

import static java.util.Collections.list;

public class App {
    public static void main(String []args) throws Exception{
       
//        JSONObject j = new JSONObject();
//        JSONObject jj = new JSONObject();
//        
//        JSONArray a = new JSONArray();
//
//        a.putAll(new int[]{9,9,9,9});
////        a.putAll( "stringArray: [0,0,0,0]");
////        j.put( "{key1: \"value1\"}");
//        j.put("a", "vasja");
//        j.put("b", "vasja");
//        j.put("s", 10);
//        j.put("g", "vasja");
//        j.put("q", 30);
//        
//        jj.put("a", "vasja");
//        jj.put("b", "vasja");
//       
//        j.put("jsonobj", jj);
//        j.put("c", a);
//        j.put("abc", new JSONArray(new int[]{3,5,7,9}));
//        System.out.println(j.getJSONString());
        String arrstr = "[{\"key1\": \"value1\"},{\"key1\": \"value1\"},{\"key1\": \"value1\"}]";
        JSONArray j = JSONParser.parseJSONArray(arrstr);
        System.out.println(j.toString());
    }
}