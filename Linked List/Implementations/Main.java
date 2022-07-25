package Implementations;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);
        list.insertAtTail(32);
        list.DisplayLL();
        // list.insertAtIndex(23, 2);
        // list.DisplayLL();

        // list.deleteAtHead();
        // list.DisplayLL();
        // list.deleteAtTail();
        // list.DisplayLL();
        // list.deleteAtIndex(2);
        // list.DisplayLL();
        // list.DisplayLLInfo();

        while(list.getSize()>0){
            list.deleteAtHead();
            list.DisplayLL();
        }
    }
}
