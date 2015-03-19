/*
 * Author:  Dr. Mark E. Lehr
 * Date:    March 6th, 2015
 * Purpose: Creating a link list 
 */

package linklist_v1;

//Basic LinkList Class
public class LinkList {
    private Node first;
    private Node head;
    
    public void insert(int data){
        //Create new node to hold the data
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        //Find the end
        if(first==null){
            first=newNode;
        }else{
            head=first;
            while(head.next!=null){
                head=head.next;
            }
            //Insert the link
            head.next=newNode;
        }
    }
    
        public boolean delete(int data){
        //Create a boolean to determine if data deleted
        boolean deleted=false;
        Node previous;
        previous=head=first;
        //Check the first position
        if(first.data==data){
            deleted=true;
            first=first.next;
            previous=head=null;
        }else{
            while(head!=null&&!deleted){
                if(head.data==data){
                    previous.next=head.next;
                    head=null;
                    deleted=true;
                }else{
                    previous=head;
                    head=head.next;
                }
            }
        }
        return deleted;
    }
    
    public void clear(){
        //Set all to null
        while(first!=null){
            head=first;
            first=first.next;
            head=null;
        }
    }
    
    public void print(){
        //Initialize the head and step through
        if(first==null){
            System.out.println("The List is Empty!!!");
        }else{
            head=first;
            while(head!=null){
                System.out.println(head.data);
                head=head.next;
            }
        }
    }    
}