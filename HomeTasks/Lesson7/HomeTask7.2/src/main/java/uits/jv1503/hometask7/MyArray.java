
package uits.jv1503.hometask7;

public class MyArray {
    public int[] array1;

    int length;
    
    public MyArray(){
    
    }

    public void CreateArray(int a){
        array1=new int[1];
        array1[0]=a;
        length = 1;
    }

    public void PrintArray(){
        for(int i=0; i<=array1.length-1; i++){
        System.out.println("Your Array: " + array1[i]);
        }
    }
    
    public void AddIndex(int a){
        length++;
        int[] array2 = new int[length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        array2[length] = a;
        System.arraycopy(array2, 0, array1, 0, array2.length);
    }


}
