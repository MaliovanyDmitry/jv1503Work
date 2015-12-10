
package uits.jv1503.hometask9;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        MyArray testArray = new MyArray();
//        for(int i = 0; i<10; i++){
//            Object o = new Integer(i*5);
//            testArray.put(o);
//        }
////        for(int i = 0; i < testArray.length(); i++){
////        System.out.println(testArray.get(i));
////        }
//        for(int i = 0; i<10; i++){
//            Object l = new Integer(i*3);
//            testArray.put(l);
//        }
//        Arrays.sort(MyArray.array);
//        for(int i = 0; i < testArray.length(); i++){
//        System.out.println(testArray.get(i));}
         MyArray testArray = new MyArray();
        for(int i = 0; i<10; i++){
            Object o = new Integer(i*5);
            testArray.put(o);
        }
MyArray test2 = new MyArray();
for(int i = 0; i<10; i++)
System.out.println(testArray.get(i));
        
    }
    
}
