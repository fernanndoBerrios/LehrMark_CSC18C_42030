/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 6th, 2015
 * Purpose: Creating a link list 
 */

package linklist_v1;

public class LinkList_V1 {

    public static void main(String[] args) {
        // Declare variables
        int loop=10;
        LinkList ll=new LinkList();
        //Fill the list
        for(int i=1;i<=loop;i++){
            ll.insert(i);
        }
        //Print the information
        ll.print();
        //Delete First, Middle and Last
        System.out.println(ll.delete(1));
        System.out.println(ll.delete(5));
        System.out.println(ll.delete(51));
        System.out.println(ll.delete(10));
        //Print again
        ll.print();
        //Clear the list
        ll.clear();
        //Print again
        ll.print();
    }
}
