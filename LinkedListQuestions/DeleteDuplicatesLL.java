import java.util.*;

public class DeleteDuplicatesLL {
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

    public static Node deleteDuplicates(Node head) {
        if(head == null) return null;

        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node prev = null;

        while(current!=null) {
            if(set.contains(current.data)) {
                prev.next = current.next;
            }
            else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);

        printList(head);

        deleteDuplicates(head);

        printList(head);
        
    }
}
