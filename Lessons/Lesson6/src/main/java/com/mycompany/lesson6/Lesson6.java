
package com.mycompany.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        
        //String s = "Вася";
        //s=s.concat(" Пупкин");
        //System.out.println(s);
     
        int [][] x = new int[5][];
        
        for(int i = 0; i<x.length; i++){
            x[i] = new int[i+1];
            for (int j = 0; j<x[i].length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    ////////////////////////////////////////////////////////    
        for(int i = x.length-1; i>=0; i--){
            x[i] = new int[i+1];
            for (int j = 0; j<x[i].length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        ///////////////////////////////////////////////////////////
        int [][] y = new int[5][];
        for (int i=0;i<=y.length-1;i++){
             y[i] = new int[i+1];
            for (int j=1;j<=y[i].length-1;j++){
                y[i][j]=0;
                System.out.print(y[i][j]);
            }
            System.out.println();
        }
        for(int i = x.length-1; i>=0; i--){
            x[i] = new int[i+1];
            for (int j = 0; j<x[i].length; j++){
             x[i][j]=0;   
            System.out.print(x[i][j]);
            }
            System.out.println();
        }
        //System.out.println();
    }
}
