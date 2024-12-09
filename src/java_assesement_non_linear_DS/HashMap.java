package java_assesement_non_linear_DS;

/*
his question is assessing your ability to assign values to a hash map, and to resolve collisions when necessary.

Given the provided HashMap, LinkedList, and Node classes, implement an assign(key,value) method for the HashMap class such that it:

hashes the key to get an array index where the key-value pair should be stored
allows the storage of different key-value pairs at the same index by adding a new Node to a LinkedList instead of overwriting an existing pair
overwrites the value if there is an existing copy of the same key in that LinkedList
Requirements and Assumptions:

Each Node in the LinkedList will have a key and value field.
The LinkedList and Node implementations are provided below the HashMap class.
 */

public class HashMap {

    LinkedList[] map;

    public HashMap(int size) {
        this.map = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.map[i] = new LinkedList();
        }
    }
    public void assign(String key, String value) {
        // Write your code here
        int arrayIndex = this.hash(key);
        LinkedList list = this.map[arrayIndex];
        Node current = list.head;
        while (current != null) {

            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        list.addToTail(key, value);
    }

    int hash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i) * (i + 1);
        }
        return hashValue % this.map.length;
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        LinkedList list = this.map[arrayIndex];
        Node current = list.head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap(5);


        hashMap.assign("apple", "fruit");
        hashMap.assign("carrot", "vegetable");
        hashMap.assign("banana", "fruit");
        hashMap.assign("apple", "red fruit");

        System.out.println("apple: " + hashMap.retrieve("apple"));
        System.out.println("carrot: " + hashMap.retrieve("carrot"));
        System.out.println("banana: " + hashMap.retrieve("banana"));
        System.out.println("orange: " + hashMap.retrieve("orange"));
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String key, String value) {
        Node newHead = new Node(key, value);
        if (this.head != null) {
            newHead.setNextNode(this.head);
        }
        this.head = newHead;
    }

    public void addToTail(String key, String value) {
        if (this.head == null) {
            this.head = new Node(key, value);
        } else {
            Node temp = this.head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node(key, value));
        }
    }

}

class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }
}

