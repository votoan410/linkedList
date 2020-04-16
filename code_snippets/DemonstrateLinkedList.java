package javaapplication10;

/**
 *
 * @author marianky
 */
public class DemonstrateLinkedList {

 
    /* Driver program to test the linked List.*/
    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        Node n = new Node(1);
        llist.append(n); 
        llist.append(new Node(2));

        llist.add(new Node(3));

        llist.insertAfter(llist.head.next, new Node(4));

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}

