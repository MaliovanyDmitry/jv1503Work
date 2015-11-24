//%%%% Solution of the problem on rounding %%%%
package com.mycompany.basictypes;
import javax.swing.*;
public class App {
    public static void main(String[] args) {
       //input data
       double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of type double"));
       int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the degree of accuracy of type int"));
       //Calculation of efficiency
       double y = x * Math.pow(10, num);
       //Calculation of residue
       int z = (int)y;
       double ostatok = (double)(y - z);
       //Calculation of last number 
       if (ostatok >= 0.5) {
        y+=1;    
        }
        //remove unnecessary
       int finalInt = (int)y;
       //calculation and output of solving the problem
       double finalDouble = finalInt / Math.pow(10, num);
        JOptionPane.showMessageDialog(null, "Your number: " + finalDouble);
           
   



//%%%% Type conversion %%%%
    
   byte b1 = 118;
    short s1 = (short)b1;   
   System.out.println("Решение задачи на приведение типов:");       
    System.out.println("short= " + s1);
   int i1 = (int)s1;
   System.out.println("int1= " + i1);
   char c1 = 'A';
   int i2 = (int)c1;
   System.out.println("int2= " + i2);
   float f1 = (float)i1;
   double d1 = (double)i1;
   long l1 = (long)i1;
   System.out.println("float= " + f1);
    System.out.println("double= " + d1);
     System.out.println("long= " + l1);
     float f2 = (float)l1;
     double d2 = (double)l1;
     System.out.println("double2= " + d2);
     System.out.println("float2= " + f2);


//%%%% exchange values %%%%
int a = 5;
int b = 8;
a = a + b;
b = a - b;
a = a - b;
System.out.println("Результат задачи с обменом значениями:");
System.out.println("a = "+ a);
System.out.println("b = "+ b);


 //%%%% modulo %%%%
 
 double k = 11;
 System.out.println("Решение задачи на деление по модулю:");
 System.out.println("k = " + (k % 3));
 
 
 
 //%%%% MAX and MIN %%%%
 int type = Integer.parseInt(JOptionPane.showInputDialog("Enter the type of a variable:\n byte is 1\n short is 2\n int is 3\n long is 4\n float is 5\n double is 6"));
 double double1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the variable value"));
 
 switch(type){
     case 1:
         if (double1<=Byte.MAX_VALUE &  double1>=Byte.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be byte");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be byte");
     break;
     case 2:
         if (double1<=Short.MAX_VALUE & double1>=Short.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be short");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be short");
     break;
     case 3:
         if (double1<=Integer.MAX_VALUE & double1>=Integer.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be int");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be int");
     break;
     case 4:
         if (double1<=Long.MAX_VALUE & double1>=Long.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be long");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be long");    
     break;
     case 5:
         if (double1<=Float.MAX_VALUE & double1>=Float.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be float");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be float");   
     break;
     case 6:
         if (double1<=Double.MAX_VALUE & double1>=Double.MIN_VALUE)
         {JOptionPane.showMessageDialog(null, "This type of variable can be long");}
         else JOptionPane.showMessageDialog(null, "This type of variable can't be long");   
     break;
     
 }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }}