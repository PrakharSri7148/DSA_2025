public class ReverseDoubly {
    
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node( int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head ==  null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

     public static  void printList() {
        Node currNode = head;
        while( currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public static void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        ReverseDoubly dll = new ReverseDoubly();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(56);
        dll.addFirst(46);
        dll.addFirst(6);
        dll.printList(); 
        dll.reverse();
        dll.printList();       
    }
}
