public class reverseLL {
    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public void print() {
        Node temp = head;
        System.out.print("Head -> ");
        while( temp != null) {
            System.out.print(temp.data+ " "+ "->"+ " ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
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
        reverseLL ll = new reverseLL();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();

        
    }
}
