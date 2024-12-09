package java_assesement_non_linear_DS;

/*
    This question will assess your ability to add and remove nodes from a tree data structure.

You will be working with a Tree class that has:

a data String property
a children property, which is an ArrayList of other Tree instances
Implement the removeChild() method, which takes in a child String parameter and deletes the first instance of any Tree with that child data from the root Tree, regardless of level.

Requirements and Assumptions:

The removeChild() method should find and delete a node at any level of the connected tree below the TreeNode it is called on.
The removeChild() method should not try to delete the parent node.
The removeChild() method only has to remove the first matching child it finds.
 */
import java.util.ArrayList;

public class Tree {
    private String data;
    private ArrayList<Tree> children;

    public Tree(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void removeChild(String data) {

        for (int i = 0; i < this.children.size(); i++) {
            if (this.children.get(i).getData().equals(data)) {
                this.children.remove(i);
                return;
            }
        }


        for (Tree child : this.children) {
            child.removeChild(data);
        }
    }

    public String getData() {
        return this.data;
    }

    public ArrayList<Tree> getChildren() {
        return this.children;
    }

    public void addChild(String data) {
        this.children.add(new Tree(data));
    }

    public static void main(String[] args) {
        Tree root = new Tree("root");

        root.addChild("child1");
        root.addChild("child2");

        root.getChildren().get(0).addChild("grandchild1");
        root.getChildren().get(0).addChild("grandchild2");
        root.getChildren().get(1).addChild("grandchild3");

        System.out.println("Tree structure before removal:");
        printTree(root, 0);

        root.removeChild("grandchild2");

        System.out.println("\nTree structure after removal:");
        printTree(root, 0);
    }


    public static void printTree(Tree node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(node.getData());
        for (Tree child : node.getChildren()) {
            printTree(child, level + 1);
        }
    }

}