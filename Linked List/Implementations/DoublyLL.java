package Implementations;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL(){
        this.size = 0;
    }
    // Node Class Structure
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    // Insertion Functions
    public void insertAtHead(int x){
        Node node = new Node(x);
        if(this.size == 0){
            this.tail = node;
            this.head = node;
        }
        else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        this.size++;
    }

    public void insertAtTail(int x){
        Node node = new Node(x);
        if(this.size == 0){
            this.tail = node;
            this.head = node;
        }
        else{
            node.prev = this.tail;
            tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void insertAtIndex(int value, int index){
        if(index==0){
            insertAtHead(value);
        }
        else if(index == this.size){
            insertAtTail(value);
        }
        else{
            Node node = new Node(value);
            Node temp = this.head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            temp.next.prev = node;
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
        }
        this.size++;
    }


    // Displaying functions
    public void displayFromHead(){
        System.out.print("Displaying List from head: ");
        if(this.size==0){
            System.out.println("List is empty.");
            return;
        }
        Node node = this.head;
        while(node!=null){

            System.out.print(node.value + "-> ");
            node = node.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void reverseList(){
        System.out.print("Reverse List is: ");
        if(this.size==0){
            System.out.println("List is empty.");
            return;
        }
        Node node = this.tail;
        while(node!=null){

            System.out.print(node.value + "-> ");
            node = node.prev;
        }
        System.out.print("End");
        System.out.println();
    }

    public void displayDLLInfo(){
        System.out.println("Value of head node: "+this.head.value + ", Value of tail node: " + this.tail.value + ", size of list:  " + this.size);
    }
}
