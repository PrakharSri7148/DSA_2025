import java.util.*;

public class ValidateBst {
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

    static ArrayList<Integer> path = new ArrayList<>();

    public static void inorder(Node root) {
        if(root == null ) return;

        inorder(root.left);
        path.add(root.data);
        inorder(root.right);
    }

    public static void checkValidity(Node root) {
        if(root == null) return;
        inorder(root);

        for (int i = 0; i < path.size() - 1; i++) {
            if (path.get(i + 1) < path.get(i)) {
                System.out.println("The tree is not a valid BST");
                return;           
            }
        }
        System.out.println("Tree is a valid BST");
    }

    public static void main(String[] args) {
        /*
                     8
                    / \
                   5  10
                  / \   \
                 3   12   11
                / \        \
               1   4        14
         */

        Node root = new Node(8);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(12);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        checkValidity(root);
    }
}
