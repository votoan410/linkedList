package linkedlist;

/**
 *
 * @author marianky
 */

/* Linked list Node*/
 class Node {
    int data;
    Node next;
    Node up;
    Node down;//create pointer that points north
    Node previous;//create pointer that points north

//constructor : 
  
    Node(int d) {
        data = d;
        next = null;
    }

    Node(int d, Node nextN) {
        data = d;
        next = nextN;
    }
    
    //constructor for string array
   
}
