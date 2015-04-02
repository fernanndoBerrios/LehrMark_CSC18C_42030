/* 
    Dr. Mark E. Lehr
    March 25th, 2015
    Purpose:  Recursion Examples

 */

package recursion;

public class Recursion {
    
    public static double rSin(double angle){
        double tol=1e-8;
        if(angle>-tol&&angle<tol)return angle-angle*angle*angle/6;
        return 2*rSin(angle/2)*rCos(angle/2);
    }
    
    public static double rCos(double angle){
        double tol=1e-8;
        if(angle>-tol&&angle<tol)return 1-angle*angle/2+angle*angle*angle*angle/24;
        double cosv=rCos(angle/2);
        double sinv=rSin(angle/2);
        return cosv*cosv-sinv*sinv;
    }
    
    public static int max(int []a,int beg,int end){
        if(end-beg<=1)return a[beg];
        int half=(beg+end)/2;
        int m1=max(a,beg,half);
        int m2=max(a,half,end);
        return(m1>m2?m1:m2);
    }
    
    public static int gcd(int m,int n){
        if(m==0)return n;
        if(m>=n)return gcd(m%n,n);
        return gcd(n%m,m);
    }
    
    public static int bcoeff(int n,int k){
        if(k==0)return 1;
        if(k==n)return 1;
        return bcoeff(n-1,k-1)+bcoeff(n-1,k);
    }
    

    public static void main(String[] args) {
       //Test out the Recursive Binomial Coefficient
       //function
       int nLim=5;
       for(int n=0;n<=nLim;n++){
           for(int k=0;k<=n;k++){
               System.out.print(bcoeff(n,k)+" ");
           }
           System.out.println();
       }
       //Test out the Greatest Common Denominator
       System.out.println("\n460/69 gcd = "+gcd(460,69));
       System.out.println("\n35/17 gcd = "+gcd(35,17));
       System.out.println("\n52/7 gcd = "+gcd(52,7));
       int num=460, den=69, snum, sden;
       int gcdval=gcd(num,den);
       snum=num/gcdval;sden=den/gcdval;
       System.out.println("\n"+num+"/"+den+"="+snum+"/"+sden);
       //Test out the max function
       int a1[]={5,4,3,2,1};
       int a2[]={2,3,5,4,1};
       int a3[]={1,2,3,4,5};
       System.out.println("\nMax value in the array = "+max(a1,0,a1.length));
       System.out.println("\nMax value in the array = "+max(a2,0,a2.length));
       System.out.println("\nMax value in the array = "+max(a3,0,a3.length));
       //Mutual Recursion
       double angle=30*Math.PI/180;
       System.out.println("\nSystem sin("+angle+")="+Math.sin(angle));
       System.out.println("\nMy sin("+angle+")="+rSin(angle));
       System.out.println("\nSystem cos("+angle+")="+Math.cos(angle));
       System.out.println("\nMy cos("+angle+")="+rCos(angle));
    }
    
}