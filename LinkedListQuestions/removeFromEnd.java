public class removeFromEnd {
    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }

    public void remove(int index) {
        int i=0;
        int target = size-index;
        Node prev = null;
        Node curr = head;
        while(i < target) {
            prev=curr;
            curr=curr.next;
            i++;
        }
        prev.next=curr.next;
        size--;
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
        removeFromEnd ll = new removeFromEnd();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.remove(3);
        ll.print();

        
    }
}
