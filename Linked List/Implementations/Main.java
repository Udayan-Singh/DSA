package Implementations;

public class Main {
    public static void main(String[] args) {

        /* Functions for Singly Linked List Start */
        // SinglyLinkedList list = new SinglyLinkedList();
        // list.insertAtHead(3);
        // list.insertAtHead(4);
        // list.insertAtHead(5);
        // list.insertAtHead(6);
        // list.insertAtHead(7);
        // list.insertAtTail(32);
        // list.DisplayLL();
        // list.insertAtIndex(23, 2);
        // list.DisplayLL();

        // list.deleteAtHead();
        // list.DisplayLL();
        // list.deleteAtTail();
        // list.DisplayLL();
        // list.deleteAtIndex(2);
        // list.DisplayLL();
        // list.DisplayLLInfo();

        // while(list.getSize()>0){
        //     list.deleteAtHead();
        //     list.DisplayLL();
        // }
        /*Functions of Singly Linked List End */

        /* Functions for Doubly Linked List Start */
        // DoublyLL li = new DoublyLL();
        // li.insertAtHead(1);
        // li.insertAtHead(2);
        // li.insertAtHead(19);
        // li.insertAtHead(11);
        // li.insertAtTail(3);
        // li.insertAtIndex(25, 2);
        // li.displayFromHead();
        // li.reverseList();
        // li.displayDLLInfo();


        /* Functions for Doubly Linked List End */

        /* Functions for Circular Linked List */
        CircularLL l = new CircularLL();
        l.insertAtTail(23);
        l.insertAtTail(1);
        l.insertAtTail(2);
        l.display();
        l.delete(1);
        l.display();

    }
}
