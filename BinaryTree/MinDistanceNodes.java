import java.util.*;

public class MinDistanceNodes {
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

    public static Boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) return false;

        path.add(root);
        if(root.data == n) return true;

        Boolean foundLeft = getPath(root.left, n, path);
        Boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public static int mdn(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        
        int size1 = path1.size();
        int size2 = path2.size();

        int fDistance = size1+size2 -2;
        return fDistance;
    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                 2     3
                / \   / \
               4   5 6   7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 3;

        System.out.println(mdn(root, n1, n2));
       
    }
}
