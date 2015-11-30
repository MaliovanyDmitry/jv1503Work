
package com.mycompany.hometask5;

public class DateFromLong {
    public static void main(String[] args){
        int day = 28;
        int month = 11;
        int year = 2015;
        int foolDate = ((day) | (month << 8) | (year  << 20));
        int mask1 = 0b11111111;
        int mask2 = 0b11111111111;
      
        System.out.printf("Day: %d, month: %d, year: %d", 
        mask1 & foolDate, 
        mask1 & foolDate >>> 8, 
        mask2 & foolDate >>> 20);
    }
}
