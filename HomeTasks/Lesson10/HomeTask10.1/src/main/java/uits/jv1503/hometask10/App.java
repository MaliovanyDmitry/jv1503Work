
package uits.jv1503.hometask10;

public class App {
    public static void main(String []args){
        JSONObject j = new JSONObject();
        JSONObject jj = new JSONObject();
        j.put("a", "vasja");
        j.put("b", "vasja");
        j.put("s", 10);
        j.put("g", "vasja");
        j.put("q", 30);
        
        jj.put("a", "vasja");
        jj.put("b", "vasja");
        
        j.put("jsonobj", jj);
        System.out.println(j.getJSONString());
    }
}
