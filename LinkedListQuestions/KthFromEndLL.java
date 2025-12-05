public class KthFromEndLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node kthNode(Node head, int k) {
        if(head == null || k<=0) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        for(int i=0; i<k; i++) {
            if(fast == null) return null;
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 3;

        Node node = kthNode(head, k);

        System.out.println(node.data);
    }

}
