package java_assesement_non_linear_DS;

/*
This question will assess your ability to check whether values are contained in a binary search tree data structure.

You will be working with a BinarySearchTree class that has:

an int data property
a left property, which is either null or another BinarySearchTree
a right property, which is either null or another BinarySearchTree
an insert() method, which adds a new node to the BinarySearchTree according to the rules of any binary search tree
Given the class provided, implement a contains() method that takes in a data value and returns true if the value is in the tree and false if it cannot be found. The method should use the principles of binary search rather than doing a complete traversal.

Requirements and Assumptions:

Do not change any other part of the BinarySearchTree class.
 */
public class BinarySearchTree {
    private BinarySearchTree left, right;
    private int data;

    public int getData() {
        return this.data;
    }

    public BinarySearchTree getLeft() {
        return this.left;
    }

    public BinarySearchTree getRight() {
        return this.right;
    }

    public BinarySearchTree(int data) {
        this.data = data;
        // left and right will be null by default
    }

    public void insert(int data) {
        if (data < this.data) {
            if (this.left == null) {
                this.left = new BinarySearchTree(data);
            } else {
                this.left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(data);
            } else {
                this.right.insert(data);
            }
        }
    }

    public boolean contains(int data) {
        if (this.data == data) {
            return true;
        }

        if (data < this.data) {
            if (this.left == null) {
                return false;
            }
            return this.left.contains(data);
        }
        if (data > this.data) {
            if (this.right == null) {
                return false;
            }
            return this.right.contains(data);
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(13);
        bst.insert(17);

        System.out.println(bst.contains(7));
        System.out.println(bst.contains(13));
        System.out.println(bst.contains(20));
        System.out.println(bst.contains(3));
        System.out.println(bst.contains(9));
    }
}

