package java_assesement_LinearDataStructures;

/*
    This question is assessing your ability to implement operations on a doubly linked list to remove elements.

Given the provided Node and DoublyLinkedList classes, add a removeHead() method to the DoublyLinkedList class:

The method may need to modify both the head and tail if necessary.
The method should return null if the list is empty.
The method should return the data in the removed Node.
Note that the Node class implementation is provided below the DoublyLinkedList class.
 */
public class DoublyLinkedList {
    public Node2 head;
    public Node2 tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node2 newHead = new Node2(data);
        Node2 currentHead = this.head;
        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;
        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public String removeHead() {
        // Write your code here
        if (this.head == null) {
            return null;
        }

        String removedData = this.head.data;
        if (this.head == this.tail) { // Only one element in the list
            this.head = null;
            this.tail = null;
        } else { // More than one element
            this.head = this.head.getNextNode();
            this.head.setPreviousNode(null);
        }

        return removedData;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addToHead("A");
        list.addToHead("B");
        list.addToHead("C");

        System.out.println("Removed: " + list.removeHead());
        System.out.println("Removed: " + list.removeHead());
        System.out.println("Removed: " + list.removeHead());
        System.out.println("Removed: " + list.removeHead());
    }

}

class Node2 {
    public String data;
    private Node2 next;
    private Node2 previous;

    public Node2(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void setNextNode(Node2 node) {
        this.next = node;
    }

    public void setPreviousNode(Node2 node) {
        this.previous = node;
    }

    public Node2 getNextNode() {
        return this.next;
    }

    public Node2 getPreviousNode() {
        return this.previous;
    }

}

