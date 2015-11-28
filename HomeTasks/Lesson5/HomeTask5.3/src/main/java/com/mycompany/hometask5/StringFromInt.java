
package com.mycompany.hometask5;



public class StringFromInt {
    public static void main(String[] args) {
 
        int number = 19;
    
        String[] FirstArray = new String[]{"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        String[] SecondArray = new String[]{"десять","одинадцать","двенадцать", "тринадцать", "четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
        String[] ThirdArray = new String[]{"0","1","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","девяносто"};
 
        if ((number >=0) && (number<=9)){
            System.out.println("Ваше число: "+ FirstArray[number]);
        }else if ((number>=10) && (number<=19)){
            System.out.println("Ваше число: "+ SecondArray[number-10]);      
        }else if ((number>=20)&&(number<=99)){
            if (number%10==0){
                System.out.println("Ваше число: "+ ThirdArray[number/10]);
            }else{
                int a = (int)number/10; 
                int b = number%10; 
                System.out.println("Ваше число: "+ ThirdArray[a] +" "+ FirstArray[b]);
            }
        }
    }
}

