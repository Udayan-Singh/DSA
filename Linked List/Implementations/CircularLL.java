package Implementations;

import org.w3c.dom.NodeList;

public class CircularLL {

    Node head;
    Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }
    
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insertAtTail(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            } 
        }while(node!=head);
    }

    public void display(){
        
        if(this.head==this.tail){
            System.out.print(this.head.val + "-> HEAD");
            return;
        }
        if(this.head==null){
            System.out.println("Empty List.");
            return;
        }

        Node temp = this.head;
        System.out.print(this.head.val + " -> ");
        temp = temp.next;
        while(temp!=head){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("HEAD");
        System.out.println();
    }
}
