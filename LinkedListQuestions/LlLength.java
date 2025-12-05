public class LlLength {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static int size(Node head) {
        if(head == null) return 0;

        int length =0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        

        System.out.println(size(head));        
    }
}
