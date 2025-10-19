public class QueuesLL {
    public static class Node {
        int data;
        Node next;

        Node(int data ) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queues {
        static Node head = null;
        static Node tail = null;

        public static Boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queues is empty");
                return -1;
            }

            int front = head.data;
            if(head == tail) {
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return front;

        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queues is empty");
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args) {
            Queues q = new Queues();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
