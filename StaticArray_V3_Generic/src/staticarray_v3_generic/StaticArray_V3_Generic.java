/* 
 * Author:  Dr. Mark E. Lehr
 * Date:    March 5th, 2015
 * Purpose: Stack implemented with int array
 */
package staticarray_v3_generic;

class StaticArray_V3_Generic<T> {

    private T []array;
    private int size;
    
    public StaticArray_V3_Generic(int n){
        array=(T[])new Object[n];
        size=0;
    }
    
    public void push(T input){
        if(array.length>size){
            array[size++]=input;
        }else{
            T nArray[]=(T[])new Object[2*array.length];
            //copy over the stuff
            for(int i=0;i<array.length;i++){
                nArray[i]=array[i];
                array[i]=null;
            }
            array=null;
            array=nArray;
            array[size++]=input;
        }
    }
    
    public T pop(){
        if(size>0){
            return array[--size];
        }
        else{
            return null;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public int alloted(){
        return array.length;
    }
    
    public void clear(){
        size=0;
    }
    
}