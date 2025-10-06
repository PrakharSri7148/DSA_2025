public class mergeSortLL {

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

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }

        if(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        if(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public static Node mergeSort(Node head) {
        
        if (head == null || head.next == null) {
        return head;
    }
        //find the midnode
        Node mid = getMid(head);

        //left and right nodes
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        mergeSortLL ms = new mergeSortLL();
        ms.addFirst(6);
        ms.addFirst(5);
        ms.addFirst(75);
        ms.addFirst(3);
        ms.addFirst(73);
        ms.addFirst(1);
        ms.printList();
        mergeSort(head);
        ms.printList();

    }
}
