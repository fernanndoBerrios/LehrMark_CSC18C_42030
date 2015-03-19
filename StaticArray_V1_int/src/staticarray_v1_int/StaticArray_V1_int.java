/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 5th, 2015
 * Purpose: Stack implemented with int array
 */
package staticarray_v1_int;

class StaticArray_V1_int {

    private int []array;
    private int size;
    
    public StaticArray_V1_int(int n){
        array=new int[n];
        size=0;
    }
    
    public void push(int input){
        if(array.length>size){
            array[size++]=input;
        }else{
            int nArray[]=new int[2*array.length];
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