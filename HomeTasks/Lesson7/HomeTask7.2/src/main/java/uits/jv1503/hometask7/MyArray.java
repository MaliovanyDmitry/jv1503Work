
package uits.jv1503.hometask7;

public class MyArray {
    int[] array1;
    int leight;
    
    public MyArray(int a){
        array1=new int[1];
        array1[0]=a;
        leight = 1;
    }



    public void PrintArray(){
        for(int i=0; i<=array1.length-1; i++){
        System.out.println("Your Array: " + array1[i]);
        }
    }


}
