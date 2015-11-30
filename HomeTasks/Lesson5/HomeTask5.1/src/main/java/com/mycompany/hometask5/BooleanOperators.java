
package com.mycompany.hometask5;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        
        System.out.println("################ Truth Table ##################");
        System.out.println("_______________________________________________");
        System.out.println("|   a    |    b   |     &   |   |   |     ^   |");
        
        a=true; 
        b=true;
        
        System.out.println("|  "+a+"  |  "+b+"  |  "+(a&b)+"   | "+(a|b)+"  |  "+(a^b)+"  |");
        
        b=false;
        
        System.out.println("|  "+a+"  |  "+b+" |  "+(a&b)+"  | "+(a|b)+"  |  "+(a^b)+"   |");
        
        a=false; b=true;
        
        System.out.println("|  "+a+" |  "+b+"  |  "+(a&b)+"  | "+(a|b)+"  |  "+(a^b)+"   |");
        
        b=false;
        
        System.out.println("|  "+a+" |  "+b+" |  "+(a&b)+"  | "+(a|b)+" |  "+(a^b)+"  |");
        System.out.println("_______________________________________________");
    }
}
