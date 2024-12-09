package java_assesement_LinearDataStructures;
/*
    This question is assessing your ability to implement a stack data structure using nodes.

Given the provided Stack, LinkedList, and Node classes, add the following methods:

A push() method that adds a data element to the top of the Stack and increases the size of the stack.
A peek() method that returns the data of the top of the Stack.
When the Stack is empty, the peek() method should return null.

Note that the LinkedList and Node class implementations are provided below the Stack implementation.

Requirements and Assumptions:

The stack does NOT have a maximum size limit.
 */
public class Stack {
    public LinkedList3 stack;
    public int size;

    public Stack() {
        this.stack = new LinkedList3();
    }

    public boolean isEmpty() {
        return this.stack.head == null;
    }

    public void push(String data) {
        // Implement this method
        this.stack.addToHead(data);
        this.size++;
    }

    public String peek() {
        // Implement this method
        if (this.isEmpty()) {
            return null;
        }
        return this.stack.head.getData();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size);

        stack.push("D");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size);
    }

}

class LinkedList3 {
    public Node4 head;

    public LinkedList3() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node4 newHead = new Node4(data);
        if (this.head != null) {
            newHead.setNextNode(this.head);
        }
        this.head = newHead;
    }

    public void addToTail(String data) {
        if (this.head == null) {
            this.head = new Node4(data);
        } else {
            Node4 temp = this.head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node4(data));
        }
    }

    public String removeHead() {
        if (this.head == null) {
            return null;
        }
        String removedData = this.head.getData();
        this.head = this.head.getNextNode();
        return removedData;
    }

}

class Node4 {
    public String data;
    private Node4 next;

    public Node4(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node4 node) {
        this.next = node;
    }

    public Node4 getNextNode() {
        return this.next;
    }

    public String getData() {
        return this.data;
    }
}

