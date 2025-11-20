import java.util.*;

public class Root2Leaf {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if(root == null) return;

        path.add(root.data);

        if(root.right == null && root.left == null) printPath(path);

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        /*
                     8
                    / \
                   5  10
                  / \   \
                 3   6   11
                           \
                            14
         */

        Node root = new Node(8);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        ArrayList<Integer> path = new ArrayList<>();
        
        printRoot2Leaf(root, path);
    }

}
