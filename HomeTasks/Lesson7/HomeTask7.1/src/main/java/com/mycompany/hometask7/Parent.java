
package com.mycompany.hometask7;

public class Parent {

    static{
        int a = 5;
        System.out.println("static: a = "+a);
    }
    
    {
    int b = 10;
    System.out.println("non static: b = "+b);
    }
    
    public Parent(){
        System.out.println("Parent constructor");
    }
    
} 
