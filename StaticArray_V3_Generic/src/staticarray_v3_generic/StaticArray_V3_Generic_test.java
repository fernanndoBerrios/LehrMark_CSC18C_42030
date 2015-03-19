/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 5th, 2015
 * Purpose: Stack implemented with int array
 */
package staticarray_v3_generic;


public class StaticArray_V3_Generic_test {

    public static void main(String[] args) {
        //Declare the stack
        int n=100;
        StaticArray_V3_Generic<Stuff> stack=new StaticArray_V3_Generic<Stuff>(n);
        System.out.println("The alloted stack size initially = "+stack.alloted());
        System.out.println("The reported stack size without data = "+stack.getSize());
        for(int i=0;i<n+1;i++){
            Stuff a=new Stuff(2,i);
            stack.push(a);
        }
        System.out.println("The alloted stack size with data = "+stack.alloted());
        System.out.println("The reported stack size with data = "+stack.getSize());
        for(int i=stack.getSize();i>0;i--){
            System.out.println(i+"="+stack.getSize()+" "+stack.pop()+" "+stack.getSize());
        }
        System.out.println("The alloted stack size after deleting data = "+stack.alloted());
        System.out.println("The reported stack size after deleting data = "+stack.getSize());
    }
    
}