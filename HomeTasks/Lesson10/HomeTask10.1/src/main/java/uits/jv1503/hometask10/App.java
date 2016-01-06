
package uits.jv1503.hometask10;

import static java.util.Collections.list;

public class App {
    public static void main(String []args){
       
        JSONObject j = new JSONObject();
        JSONObject jj = new JSONObject();
        
        JSONArray a = new JSONArray();

        a.putAll(new int[]{9,9,9,9});
        a.putAll( "stringArray: [0,0,0,0]");
        j.put( "{key1: \"value1\"}");
        j.put("a", "vasja");
        j.put("b", "vasja");
        j.put("s", 10);
        j.put("g", "vasja");
        j.put("q", 30);
        
        jj.put("a", "vasja");
        jj.put("b", "vasja");
       
        j.put("jsonobj", jj);
        j.put("c", a);
        j.put("abc", new JSONArray(new int[]{3,5,7,9}));
        System.out.println(j.getJSONString());
    }
}
