public class EqualLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Boolean isEqual(Node head1, Node head2) {
        if( head1 == null || head2 == null) return false;

        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null) {
            if(temp1.data != temp2.data) {
                return false;
            }
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1== null && temp2 == null;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);

        Boolean ans = isEqual(head1, head2);

        System.out.println(ans);


    }
}
