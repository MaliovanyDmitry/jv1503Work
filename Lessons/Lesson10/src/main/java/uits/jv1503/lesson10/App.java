
package uits.jv1503.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {
    
    public static void main(String[] args) {
        
        List l = new ArrayList<String>();
        List<String> t = new LinkedList<>();
       
        for(int j=0; j<=10; j++){
            l.add(j);
            t.add(""+(10+j));
        }
        
        for(int j = 0; j<=10; j++){
            System.out.println(l.get(j));
            System.out.println(t.get(j));
        }
        
        Iterator i = t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        Map<Integer, String> m = new HashMap();
        for(int j=0; j<=10; j++){
            m.put(j, ""+(j+100));
            System.out.println(m.get(j));
        }
        
    }

}
