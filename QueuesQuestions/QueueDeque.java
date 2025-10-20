import java.util.*;

public class QueueDeque {

    static class Queue {
        static Deque<Integer> d = new LinkedList<>();

        public static Boolean isEmpty() {
            return d.isEmpty();
        }
        public static void add(int data) {
            d.addLast(data);
        }

        public static int remove() {
            return d.removeFirst();
        }

        public static int peek() {
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
