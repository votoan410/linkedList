/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author timmy
 */
import java.util.*;

public class Assignment4_2 {
    Node head;
    Node tail;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        System.out.println("How many rebels? ");//asking users to input the linked list size
        int in = input.nextInt();//input size or new node
       System.out.println("the linked list: ");
        LinkedList llist = new LinkedList();// create linked list
        Node n = new Node(in);// new node 
        llist.head =n;
        for ( int i = 1; i < in; i++){// adding values to linked list starting from one 
              llist.insertAfter(llist.head, new Node(i));
        } 
        llist.printList();//print linked list
        
        //next  line will point new node to the n inputted value to make it a circular linked list
        llist.cirlist(new Node(1));
        
        System.out.println("\ncircular List: ");
        llist.printList();
        
        System.out.println("");
      
        for ( int j =0; j < llist.size(); j++){
           
            llist.remove(2);// remove the following person
            //llist.change_index();// change the index, point to the next values so that
            //the next node is removed 
            llist.printList();
            System.out.println(); 
         }
      
        System.out.print("the survivor is: ");
        llist.printList();
        }
   
    
       
}
