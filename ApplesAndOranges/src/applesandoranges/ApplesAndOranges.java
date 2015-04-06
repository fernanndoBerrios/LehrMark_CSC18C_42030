/*
     Example code from the following site 
     http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
     Java Object Sorting Example (Comparable And Comparator)
     Posted on July 7, 2010 ,     Last modified : August 29, 2012
     By mkyong
     Example as a solution to a Student's question
 */
package applesandoranges;

import java.util.Arrays;
 
public class ApplesAndOranges{
 
	public static void main(String args[]){
 
		Fruit[] fruits = new Fruit[4];
 
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",60); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
 
		Arrays.sort(fruits);
		int i=0;
                System.out.println();
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
                
                Arrays.sort(fruits, Fruit.FruitNameComparator);
                i=0;
                System.out.println();
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
                
	}	
}