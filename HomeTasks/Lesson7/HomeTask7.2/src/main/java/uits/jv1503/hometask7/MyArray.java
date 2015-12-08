
package uits.jv1503.hometask7;

public class MyArray {
    public int[] array1;
    int i;
    int j;
    int length;
    
    public void CreateArray(int a){
        array1 = new int[a];
        for(i=0; i<=array1.length; i++){
           array1[i] = (int) ( Math.random() * a);
        }
    }
    public void PrintArray(){
        for(i=0; i<=array1.length-1; i++){
        System.out.println("Your Array: " + array1[i]);
        }
    }
    
    
//    public void AddIndex(int a){
//        length++;
//        int[] array2 = new int[length];
//        //System.arraycopy(array1, 0, array2, 0, array1.length-1);
//        
//        array2[length] = a;
//        array1 = array2;
//
//    }

    
}
