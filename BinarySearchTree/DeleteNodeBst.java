public class DeleteNodeBst {
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

    public static Node delete(Node root, int val) {
        if(root.data > val) root.left=delete(root.left, val);
        else if (root.data <val) root.right = delete(root.right, val);
        else{
            //case 1- leaf node
            if(root.left == null && root.right == null) return null;

            //case 2- Single node
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            //case 3- Two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        if (root == null) return null;

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        /*
                     8
                    / \
                   5  10
                  / \   \
                 3   6   11
                / \        \
               1   4        14
         */

        Node root = new Node(8);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        inorder(root);
        int val = 1;
        System.out.println();
        delete(root, val);
        inorder(root);
    }
}
