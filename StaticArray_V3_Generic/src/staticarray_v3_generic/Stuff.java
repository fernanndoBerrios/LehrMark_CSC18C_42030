/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 5th, 2015
 * Purpose: Stack implemented with int array
 */
package staticarray_v3_generic;


public class Stuff {
    private int []array;
    
    Stuff(int n,int beg){
        array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=beg+i;
        }
    }
    
    public String toString(){
        String content="";
        for(int i=array.length-1;i>=0;i--){
            content+=array[i];
        }
        return content;
    }
    
}
