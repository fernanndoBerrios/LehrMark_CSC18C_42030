/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 5th, 2015
 * Purpose: Stack implemented with int array
 */
package staticarray_v2_integer;

class StaticArray_V2_Integer {

    private Integer []array;
    private int size;
    
    public StaticArray_V2_Integer(int n){
        array=new Integer[n];
        size=0;
    }
    
    public void push(int input){
        if(array.length>size){
            array[size++]=input;
        }else{
            Integer nArray[]=new Integer[2*array.length];
            //copy over the stuff
            for(int i=0;i<array.length;i++){
                nArray[i]=array[i];
            }
            array=nArray;
            array[size++]=input;
        }
    }
    
    public int pop(){
        if(size>0){
            return array[--size];
        }
        else{
            return 0;
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