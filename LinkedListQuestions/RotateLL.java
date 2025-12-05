public class RotateLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head, int k) {
        if(head == null || head.next == null || k<=0) return head;

        Node temp = head;
        int length = 1;
        while(temp.next!=null) {      //calculate the length 
            temp = temp.next;
            length++;
        }

        temp.next = head;     //make a circle 

        k = k%length;          //effective rotation

        int end = length-k;
        Node newTail = head;


        for(int i=1; i<end; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        newTail.next = null;

        return newHead;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int k = 2;
        
        Node newLL = rotate(head, k);

        printList(newLL);
    }
}
