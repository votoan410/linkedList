package javaapplication10;

/**
 *
 * @author marianky
 */
public class LinkedList {

    Node head; // head of list 
    int size;
    
    public LinkedList(){
        head = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    /* Inserts a new Node at front of the list. */
    public void add(Node newNode) {
        /* 1. Set next of new Node to head */
        newNode.next = head;

        /* 2. Now head  points to new Node */
        head = newNode;
        size++;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prevNode, Node newNode) {
        /* 1. Check if the given previous Node is null */
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        /* 2. Make next of new Node as next of prev_node */
        newNode.next = prevNode.next;

        /* 3. make next of prev_node as new_node */
        prevNode.next = newNode;
        size++;
    }

    /* Appends a new node at the end.*/
    public void append(Node newNode) {
       
        /* 1. If the Linked List is empty, then make the 
	new node as head */
        if (head == null) {
            head = newNode;
            return;
        }

        /* 2. This new node is going to be the last node, so 
	make next of it as null */
        newNode.next = null;

        /* 3. Else traverse till the last node */
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        /* 4. Change the next of last node */
        last.next = newNode;
        return;
    }

    /* This function prints contents of linked list*/
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
}
