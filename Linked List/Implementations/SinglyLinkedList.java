package Implementations;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            // By default we have null value  for node
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    
    // Inserting functions.
    public void insertAtHead(int x){

        //Create a node with value x
        Node node = new Node(x);

        if(this.size==0){            
            tail = node;
        }
        else{
            node.next = head;
        }
        head = node;
        this.size++;
    }

    public void insertAtTail(int x){
        Node node = new Node(x);
        if(this.size == 0){
            this.head = node;
        } else{
            this.tail.next = node;
        }
        this.tail = node;
        this.size++;
    }

    public void insertAtIndex(int val, int index){
        if(index==0){
            insertAtHead(val);
        }
        else if(index == this.size){
            insertAtTail(val);
        }
        else if(index>size){
            System.out.println("Invalid index entered.");
        }
        else{
            Node temp = head;

            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
        }
        this.size++;
    }

    // Deleting functions
    public void deleteAtHead(){
        if(this.size==1){
            this.head = null;
            this.tail = null;
        }
        else if(this.size==0){
            System.out.println("Nothing to delete. Empty list.");
        }
        else{
            head = head.next;
        }
        this.size--;
    }

    public void deleteAtTail(){
        if(this.size==1){
            this.head = null;
            this.tail = null;
        }
        else if(this.size==0){
            System.out.println("Nothing to delete. Empty list.");
        }
        else{
            Node temp = this.head;
            for(int i = 1; i < this.size-2; i++){
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
        }
        this.size--;
    }

    public void deleteAtIndex(int index){

        if(index==0){
            deleteAtHead();
        }
        else if(index==this.size-1){
            deleteAtTail();
        }
        else{
            Node temp = this.head;
            for(int i=0; i<index-1;i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        this.size--;
    }

    // Displaying functions
    public void DisplayLL(){
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

    public void DisplayLLInfo(){
        System.out.println(this.head.value + " " + this.tail.value + " " + this.size);
    }
    
}


