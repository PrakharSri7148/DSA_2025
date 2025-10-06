public class detectingCycle {

    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }
    
    public static boolean cycleExists() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
       
        detectingCycle ll = new detectingCycle();

       nodej.addFirst(8);
       nodej.addFirst(7);
       nodej.addFirst(6);
       nodej.addFirst(5);
       nodej.addFirst(4);
       nodej.addFirst(3);
       nodej.addFirst(2);
       nodej.addFirst(1);
       nodej.printLL();
       boolean result = cycleExists();
       System.out.println(result);

    }
}
