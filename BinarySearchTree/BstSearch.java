public class BstSearch {
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

    // public static Node insert(Node root, int val) {
    //     if(root == null) {
    //         root = new Node(val);
    //         return root;
    //     }

    //     if(val < root.data) root.left = insert(root.left, val);
    //     else root.right = insert(root.right, val);

    //     return root;
    // }

    public static Boolean search(Node root, int key) {
        if (root == null) return false;
        
        if (root.data == key) return true;

        Boolean searchRight = search(root.right, key);
        Boolean searchLeft = search(root.left, key);

        return searchRight || searchLeft;
    }



    public static void main(String[] args) {
        // int values[] = {5, 1, 3, 4, 2, 7};
        // Node root = null;

        // for(int i=0; i<values.length; i++) {
        //     root = insert(root, values[i]);
        // }


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

        int key = 1;
        Boolean ans = search(root, key);
        System.out.println(ans);


    }
}
