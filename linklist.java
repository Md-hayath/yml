/*import org.w3c.dom.Node;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;*/


//import static sun.nio.ch.DefaultSelectorProvider.get;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


 public class linklist{
     private int val;
     private Node tail;
     private Node head;

    private  int size;
    public linklist() {
        this.size=0;


    }

    //--------------INSERT  AT  FIRST -----------------------
    public void insertFirst(int val){
       Node node =new Node( val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
        }
        size++;
        return;

        }

        //------------ DISPLAY -------------------
        public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
            //System.out.print("END");


        }
            System.out.print("END");

        }

        //--------------------INSERT AT LAST --------------------
     public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;

         size++;
     }

     //---------- DELETE-AT-FIRST ------------
     private int deleteFirst(){

         int val=head.val;
         head=head.next;
            if (head == null) {
             tail=null;
         }
         size--;
         return  val;
     }
     public Node get(int index) {
         Node node = head;
         for (int i = 0; i < index; i++) {
             node = node.next;
         }
         return node;
     }

     //------------------DELETE-AT-LAST -------------------
     public int deleteLast(){

        if (tail==null) {
            deleteFirst();
        }
        Node secondlst=get(size-2);
         int val=tail.val;
         tail=secondlst;
         tail.next=null;

        size--;
        return val;
     }
     //--------REVERSE----------------
     private void reverse(){
        Node current=head;
        Node prev=null;
        Node next=null;


         while (current != null){
             next = current.next;   // Save next node
             current.next = prev;   // Reverse link
             prev = current;        // Move prev forward
             current = next;        // Move current forward
         }

         head = prev;  // Update head to new front
     }

     //


     //--------------- MAIN-FUNCTION -----------------
        public static void main(String[] args){
          linklist list = new linklist();
            linklist pist = new linklist();
            list.insertFirst(3);
            list.insertFirst(2);
            list.insertFirst(1);
            list.display();
            System.out.println();
            System.out.println("inserting at last ");
            list.insertLast(4);
            list.insertLast(5);
            list.insertLast(6);
            list.insertLast(7);
            list.insertLast(8);
            list.display();
            System.out.println(" ");
            System.out.println("After deleting a node at front ");

            //int deletedValue = list.deleteFirst();
            //System.out.println("Deleted value: " + deletedValue);
            list.deleteFirst();
            list.display();

            list.deleteLast();
            System.out.println(" ");
            System.out.println("After deleting a node  at last");

            list.display();
            list.reverse();
            System.out.println(" ");
            System.out.println("After reversing a node ");
            list.display();


        }

     }










