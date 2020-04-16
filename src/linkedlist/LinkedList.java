package linkedlist;

/**
 *
 * @author marianky
 */
public class LinkedList {

    Node head; // head of list 
    int size;
    Node tail; // tail of list 

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
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
    }

    /* This function prints contents of linked list*/
    public void printList() {
        Node tnode = head;//setting the tnode as the head of the linked list
        while (tnode != null) {// as long as tnode is not null
            System.out.print(tnode.data + " ");// print out the content of linked list
            tnode = tnode.next;// tnode is now pointing at the next node
        }
    }

    public void remove() {
        if (head == null) {
            return;
        }
        if (head.next != null) {
            Node prevnode = head;
            Node lastnode = head.next;
            while (lastnode.next != null) {
                prevnode = prevnode.next;
                lastnode = lastnode.next;
            }
        } else {
            head = null;
        }
    }
    
    
    //iterative reserve method 
    public Node reverse() 
    { 
        Node current = head;//setting the current node as head 
        Node prev = null; //let the previous node be null
        Node next = null; //let the next node be null
        while (current != null) { //while current node is not null
            next = current.next; // point at next node
            current.next = prev; // reverse, point at previous node instead of next node
            prev = current; // previous node becomes current node
            current = next; // the current node becomes next node
        } 
 
      head=prev;//assign prev to head which making the head as the last value  of linked list  
      return prev; // since the head is now at the end, so it will return the tail as the new head
    } 
  void remove(int position) 
    {
        // Store head node 
        Node h = head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            head = h.next;   // Change head 
            return; 
        } 
  
        // Find previous node of the node to be deleted 
        for (int i=0; h!=null && i<position-1; i++) 
            h = h.next; 
  
        // If position is more than number of ndoes 
        if (h == null || h.next == null) 
            return; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = h.next.next; 
  
        h.next = next;  // Unlink the deleted node from list 
    } 
  public void cirlist(Node n){
// following line point the tail to the head to make circular linked list
  
      tail = n;
      tail.next = head;
      tail = head;
  }
  public void change_index(){
      //move index up by 2 steps 
      Node h = head;
      head = h.next.next;

    }
}
