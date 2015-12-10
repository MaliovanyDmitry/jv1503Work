
package uits.jv1503.hometask9;

public class MyArray {
    private Object[] array;
    
    public MyArray(){
        array = new Object[1];
    }
    
    public void put(Object o){
        if (array.length == 1){
            if (array[0] == null){
                //пихаем значение по текущему индексу
                array[0]=o;
            } else {
                //вставка элемента
                insertElement(o);
            }
        } else {
            //вставка элемента
            insertElement(o);
        }
    }
    
    public void insertElement(Object o){
        Object[] tmpArr= new Object[array.length+1];
        for(int i=0; i<tmpArr.length; i++){
            if (i<array.length){
                tmpArr[i]=array[i];
            } else {
                tmpArr[i]=o;
            }
        }
        array = tmpArr;
        
    }
    
    public Object get(int index){
        if(index<array.length && index>=0)
            return array[index];
        return null;
    }
    
    public int length(){
        return array.length;
    }
    
    
    
}
