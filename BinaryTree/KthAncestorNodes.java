import java.util.ArrayList;

public class KthAncestorNodes {
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

    public static int ancestor(Node root, int n, int k) {
        ArrayList<Node> path = new ArrayList<>();

        getPath(root, n, path);

        if(!path.isEmpty()) path.remove(path.size()-1);

        if(k>path.size()) return -1;

        return path.get(path.size()-k).data;


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

        int n =4;
        int k = 1 ;

        System.out.println(ancestor(root, n, k));
       
    }
}
