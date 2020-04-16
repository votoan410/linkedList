package javaapplication10;

/**
 *
 * @author marianky
 */

/* Linked list Node*/
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    Node(int d, Node nextN) {
        data = d;
        next = nextN;
    }
}
