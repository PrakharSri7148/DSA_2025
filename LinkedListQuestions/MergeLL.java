public class MergeLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static Node merge(Node head1, Node head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if(head1.data < head2.data) {
            head1.next = merge(head1.next, head2);
            return head1;
        }
        else{
            head2.next = merge(head1, head2.next);
            return head2;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        
        Node head2 = new Node(6);
        head2.next = new Node(7);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(9);
        head2.next.next.next.next = new Node(10);

        Node merged = merge(head1, head2);

        printList(merged);



              
    }
}
