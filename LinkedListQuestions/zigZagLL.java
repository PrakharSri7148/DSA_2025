public class zigZagLL {
    
    static class Node {
        int data ;
        Node next;

        Node(int data) {      //constructer
            this.data = data;
            this.next = null;
        }
    }
    
    public void printList() {
        Node currNode = head;
        while( currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
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

    public static void zigZag() {
        ////////////////////////    find mid     /////////////////////
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //////////////////////  reverse second half  ////////////////////
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;       //broken the linked list
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        
        /////////////////////   alt merge - zigZag merge    ///////////////////
        Node LH = head;
        Node RH = prev;

        Node nextL;
        Node nextR;

        while(LH != null && RH != null) {
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            RH = nextR;
            LH = nextL;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        zigZagLL ll = new zigZagLL();
        ll.addFirst(60);
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.printList();
        ll.zigZag();
        ll.printList();
    }
}
