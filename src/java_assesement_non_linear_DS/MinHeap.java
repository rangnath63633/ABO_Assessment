package java_assesement_non_linear_DS;

/*
This question will assess your ability to remove values to a Min-Heap.

You will be working with a MinHeap class that has a heap property a size property, a swap() method, an add() method, a bubbleUp() method, and a heapify() method.

Given the provided constructor, implement a popMin() method which removes the minimum element from the heap. The popMin() method should:

Make sure that the heap maintains the heap criteria listed above after removal. The heapify() method will be helpful here.
Return null when called on an empty heap, but leave a null element in the heap array.
Requirements and Assumptions:

The MinHeap instance should always have its minimum element at index 1 and its last element at index this.size.
Its 0 index should be empty, or null.
The value of any parent node is less than or equal to the values of its child nodes.
For each index in the MinHeap the following should be true:
parent of that index: (index / 2), rounded down
left child of that index: index * 2
right child of that index: (index * 2) + 1
 */
import java.util.ArrayList;

import java.util.ArrayList;

public class MinHeap {
    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public void add(int value) {
        this.heap.add(value);
        this.size++;
        this.bubbleUp();
    }

    public int popMin() {
        if (this.size == 0) {
            throw new IllegalStateException("Heap is empty. Cannot pop from an empty heap.");
        }
        int min = this.heap.get(1);
        this.heap.set(1, this.heap.get(this.size));
        this.heap.remove(this.size);
        this.size--;
        if (this.size > 0) {
            this.heapify();
        }
        return min;
    }

    private void bubbleUp() {
        int current = this.size;
        while (current > 1 && this.heap.get(this.getParent(current)) > this.heap.get(current)) {
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
        }
    }

    private void heapify() {
        int current = 1;
        int leftChild = this.getLeft(current);
        int rightChild = this.getRight(current);
        while (this.canSwap(current, leftChild, rightChild)) {
            if (this.exists(rightChild) && this.exists(leftChild)) {
                if (this.heap.get(leftChild) < this.heap.get(rightChild)) {
                    this.swap(current, leftChild);
                    current = leftChild;
                } else {
                    this.swap(current, rightChild);
                    current = rightChild;
                }
            } else {
                this.swap(current, leftChild);
                current = leftChild;
            }
            leftChild = this.getLeft(current);
            rightChild = this.getRight(current);
        }
    }

    private void swap(int a, int b) {
        int temp = this.heap.get(b);
        this.heap.set(b, this.heap.get(a));
        this.heap.set(a, temp);
    }

    private boolean exists(int index) {
        return index <= this.size;
    }

    private boolean canSwap(int current, int leftChild, int rightChild) {
        return (this.exists(leftChild) && (this.heap.get(current) > this.heap.get(leftChild)))
                || (this.exists(rightChild) && (this.heap.get(current) > this.heap.get(rightChild)));
    }

    public int getParent(int current) {
        return (int) Math.floor(current / 2);
    }

    public int getLeft(int current) {
        return current * 2;
    }

    public int getRight(int current) {
        return (current * 2) + 1;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(15);

        System.out.println("Min: " + minHeap.popMin());
        System.out.println("Min: " + minHeap.popMin());
    }
}
