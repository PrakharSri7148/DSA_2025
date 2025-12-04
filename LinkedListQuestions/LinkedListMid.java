public class LinkedListMid {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 

    public static Node findMid(Node head) {
        if(head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node mid = findMid(head);
        System.out.println(mid.data);
    }
}
