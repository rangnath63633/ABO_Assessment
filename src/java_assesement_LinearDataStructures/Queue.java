package java_assesement_LinearDataStructures;

/*
    Given the provided Queue, LinkedList, and Node classes, add a dequeue() method to the Queue class with the following requirements:

When there is an element to remove:

It removes an element from the front of the Queue.
It returns the data of the removed element.
It decreases the size of the Queue.
When there is no element in the Queue to remove, the method should return null, and the Queue should not be modified.

Note that the Node and LinkedList implementations are provided below the Queue class.
 */
public class Queue {
    public LinkedList2 queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList2();
        this.size = 0;
    }

    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size++;
    }

    public String dequeue() {
        // Write your code here
        if (this.size == 0) {
            return null;
        }
        String removedData = this.queue.removeHead();
        this.size--;
        return removedData;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Queue size: " + q.getSize());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
    }
}

class LinkedList2 {
    public Node3 head;

    public LinkedList2() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node3 newHead = new Node3(data);
        if (this.head != null) {
            newHead.setNextNode(this.head);
        }
        this.head = newHead;
    }

    public void addToTail(String data) {
        if (this.head == null) {
            this.head = new Node3(data);
        } else {
            Node3 temp = this.head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node3(data));
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

class Node3 {
    public String data;
    private Node3 next;

    public Node3(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node3 node) {
        this.next = node;
    }

    public Node3 getNextNode() {
        return this.next;
    }

    public String getData() {
        return this.data;
    }
}
