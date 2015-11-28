
package com.mycompany.hometask5;


public class StringFromInt2 {
    public static int number =  35; 

    public static void main(String[] args) {
       int x =(int)number/10;
       int y = (int)number%10;
        String res2,res3;
        String result;
        if(number>=0 && number <=9)
        {System.out.println(res2(number));}
        else if (number>=10 && number <=19)
        {System.out.println(res3(number));}
        else{
        if (number%10==0)
        {System.out.println(res4(number));}
        else 
        {System.out.println(res4(x)+""+res2(y));}
}}
    
   
public static String res2(int a){
 
    String res2;
                switch (a){
                case 0:
                res2="ноль";
                break;
                case 1:
                res2="один";
                break;
                case 2:
                res2="два";
                break;
                case 3:
                res2="три";
                break;
                case 4:
                res2="четыре";
                break;
                case 5:
                res2="пять";
                break;
                case 6:
                res2="шесть";
                break;
                case 7:
                res2="семь";
                break;
                case 8:
                res2="восемь";
                break;
                case 9:
                res2="девять";
                break;
                return res2;
            }
                 
                
public static String res3(int a) {
      String res3;
              switch (a){
                case 10:
                res3="десять";
                break;
                case 11:
                res3="одинадцать";
                break;
                case 12:
                res3="двенадцать";
                break;
                case 13:
                res3="тринадцать";
                break;
                case 14:
                res3="четырнадцать";
                break;
                case 15:
                res3="пятнадцать";
                break;
                case 16:
                res3="шестнадцать";
                break;
                case 17:
                res3="семнадцать";
                break;
                case 18:
                res3="восемнадцать";
                break;
                case 19:
                res3="девятнадцать";
                break;
                return res3;}
}
public static String res4(int a) {
  
    String res4;
              switch (a){
                case 20:
                res4="двадцать";
                break;
                case 30:
                res4="тридцать";
                break;
                case 40:
                res4="сорок";
                break;
                case 50:
                res4="пятдесят";
                break;
                case 60:
                res4="шестдесят";
                break;
                case 70:
                res4="семдесят";
                break;
                case 80:
                res4="восемдесят";
                break;
                case 90:
                res4="девяносто";
                break;
                
                return res4;}
}
}}


             

               





 
        
    
  