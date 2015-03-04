/*
 * Dr. Mark E. Lehr
 * Date:  March 3rd, 2015
 * Purpose:  Example to Analyze how the Algorithm Scales
 */

package marksortanalysis;

import java.util.Random;
import java.util.Date;

public class MarkSortAnalysis_Time {
    //Global Static
    //Operations for additions, equalities and logic comparisons
    static int opeq,oplog,opadd;

    //Fill the array with 2 digit numbers
    public static int []fillArray(int n){
        int array[]=new int[n];
        Random rand=new Random();
        int max=99;int min=10;
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(max-min+1)+min;
        }
        return array;
    }
    //Print the array
    public static void print(int a[],int perLine){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(i%perLine==(perLine-1))System.out.println();
        }
    }
    //Find the max
    public static int max(int a[]){
        int amax=a[0];
        for(int i=1;i<a.length;i++){
            if(amax<a[i])amax=a[i];
        }
        return amax;
    }
    //Find the min
    public static int min(int a[]){
        int amin=a[0];
        for(int i=1;i<a.length;i++){
            if(amin>a[i])amin=a[i];
        }
        return amin;
    }
    //Simplest Sort -> MarkSort 6 lines long
    public static int []markSort(int a[]){
        //Declare and use
        int temp;int nm1=a.length-1;int n=a.length;
        //Loop for each cap of lst
        for(int cap=0;cap<nm1;cap++){
            //Loop on every element below the cap
            for(int lst=cap+1;lst<n;lst++){
                if(a[cap]>a[lst]){
                    temp=a[cap];
                    a[cap]=a[lst];
                    a[lst]=temp;
                }
            }
        }
        return a;
    }
    //Analyze the Simplest Sort -> MarkSort
    public static int []mrkSrtA(int a[]){
        //Declare and use
        int temp;int nm1=a.length-1;int n=a.length;
        //Loop for each cap of lst
        opeq++;
        for(int cap=0;cap<nm1;cap++){
            oplog++;opadd++;
            //Loop on every element below the cap
            opeq++;opadd++;
            for(int lst=cap+1;lst<n;lst++){
                oplog+=2;opadd++;
                if(a[cap]>a[lst]){
                    temp=a[cap];
                    a[cap]=a[lst];
                    a[lst]=temp;
                    opeq+=3;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        //Declare variables
        int size=160000;
        int array[]=fillArray(size);
        //Print the array and the min and max
        //print(array,10);
        //System.out.println("The max = "+max(array));
        //System.out.println("The min = "+min(array));
        //Sort the array
        long startTime = System.currentTimeMillis();
        mrkSrtA(array);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime)/1000.0f + " seconds");
        //Output the efficiency
        //System.out.println("Analyze by comparing operations");
        //System.out.println("n = "+array.length);
        //System.out.println("nEq = "+opeq);
        //System.out.println("nAdd = "+opadd);
        //System.out.println("nLog = "+oplog);
        //System.out.println("Total = "+(opeq+opadd+oplog));
    }
    
}