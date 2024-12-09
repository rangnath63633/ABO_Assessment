package java_assesement_LinearDataStructures;

/*
    This question is assessing your ability to implement operations on a linked list to add an element.

Given the provided Node and LinkedList classes, add the following methods to the LinkedList class:

an addToHead() method that:

adds a data value to the start of the LinkedList
handles both empty and non-empty list scenarios
an addToTail() method that:

adds a data value to the end of the LinkedList
handles both empty and non-empty list scenarios
Note that the Node class is provided below the LinkedList class.

Requirements and Assumptions:

This is a singly linked list. Each node only has a reference to the next node.
Code
 */
public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        // Write your code here
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void addToTail(String data) {
        // Write your code here
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addToHead("B");
        list.addToHead("A");

        list.addToTail("C");
        list.addToTail("D");

        list.printList();
    }

}

class Node1 {
    public String data;
    private Node next;

    public Node1(String data) {
        this.data = data;
        this.next = null;
    }
    public void setNextNode(Node node) {
        this.next = node;
    }
    public Node getNextNode() {
        return this.next;
    }
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

