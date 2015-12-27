
package uits.jv1503.hometask10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JSONArray {
    
    public List getList(int[] arr){
        ArrayList list = new ArrayList();
        for(int i = 0; i<=arr.length-1; i++)
            list.add(arr[i]);
        return list;
    }
    
    public List getList(String[] arr){
        ArrayList list = new ArrayList();
        for(int i = 0; i<=arr.length-1; i++)
            list.add(arr[i]);
        return list;
    }
    
    public List getList(ArrayList arr){
        ArrayList list = new ArrayList();
        list = arr;
        return list;
    }

    
    
    
}
