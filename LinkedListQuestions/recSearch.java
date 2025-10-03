public class recSearch {
    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recursiveSearch(int key) {
        return helper(head, key);
         
    }
    
    public void print() {
        Node temp = head;
        while( temp != null) {
            System.out.print(temp.data+ " "+ "->"+ " ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        recSearch ll = new recSearch();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(size);
        int value = ll.recursiveSearch(4);
        System.out.println(value);

        
    }
}
