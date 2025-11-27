import java.util.*;

public class MergeBST {
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

    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void Inorder(Node root) {
        if(root == null) return;

        Inorder(root.left);
        list.add(root.data);
        Inorder(root.right);
    }

    public static Node createBST(ArrayList<Integer> list, int st, int end) {
        if(st>end) {
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid-1);
        root.right = createBST(list, mid+1, end);

        return root;
    }

    public static void InorderTraversal(Node root) {
        if(root == null) return;

        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);

    }
    public static void main(String[] args) {
        /*
                   2
                  / \        BST 1
                 1   4

                   9
                  / \        BST 2
                 3  12 
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        

        Inorder(root1);
        Inorder(root2);

        Collections.sort(list);


        Node mergedRoot = createBST(list, 0, list.size()-1);

        InorderTraversal(mergedRoot);

    }
}
