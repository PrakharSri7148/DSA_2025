public class MirrorBst {

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

    public static Node mirror(Node root) {
        if(root == null) return null;

        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;

        return root;
        
    }

    public static void preOrder(Node root) {

        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

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

        preOrder(root);

        mirror(root);
        System.out.println();

        preOrder(root);
    }
}
