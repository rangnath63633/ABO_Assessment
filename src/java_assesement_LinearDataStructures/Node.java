package java_assesement_LinearDataStructures;

/*

    This question is assessing your ability to construct a node data structure that can store a value.

Create a basic Node class that contains data and a link to the next node. It should have the following characteristics:

A data field of type String.
A next field of type Node.
A constructor that accepts a string to initialize the data field and sets the next field to null.
Requirements and Assumptions:

The Node class’ next field must be accessible only within the Node class itself.
 */
public class Node {
    // Write your code here

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }

    protected Node getNext() {
        return this.next;
    }

    protected void setNext(Node next) {
        this.next = next;
    }

    public static void main(String[] args) {
        Node node1 = new Node("First");
        Node node2 = new Node("Second");

        node1.setNext(node2);

        System.out.println("Node 1 Data: " + node1.getData());
        System.out.println("Node 2 Data: " + node1.getNext().getData());
    }
}

