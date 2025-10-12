public class DoubleLL {
    
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

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public static void removeLast() {
        if(head == null) {
            System.out.println("The DoublyLL is empty");
            return;
        }
        if(size == 1) {
            head = tail = null;
            return;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public static void removeFirst() {
        if(head == null) {
            System.out.println("The DoublyLL is empty");
            return;
        }
        if(size == 1) {
            head = tail = null;
            return;
        }
        else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

     public static  void printList() {
        Node currNode = head;
        while( currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(56);
        dll.addFirst(46);
        dll.addFirst(6);
        dll.printList();
        dll.addLast(911);
        dll.printList();
        dll.removeLast();
        dll.printList();
        dll.removeFirst();
        dll.printList();
        System.out.println(dll.size);

         
    }
}
