public class removingCycle {

    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }
    
     public static void printLL() {
        Node temp = head;
        System.out.print("Head -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        
        //detect cycle using floyd's algorithm
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            System.out.println("No cycle detected");
            return;
        }

        //find the start of the cycle
        slow = head;
        Node prev = null;

        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        //remove the cycle
        prev.next = null;
        System.out.println("cycle is removed");

    }



    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
       
        removingCycle ll = new removingCycle();

       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = head.next;
       removeCycle();
       ll.printLL();

    }
}
