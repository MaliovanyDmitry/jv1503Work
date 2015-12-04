
package com.mycompany.hometask7;

public class Child extends Parent {
static{
        int a = 20;
        System.out.println("static: a = "+a);
    }
    
    {
    int b = 30;
    System.out.println("non static: b = "+b);
    }
    
    public Child(){
        System.out.println("Child constructor");
    }
}
