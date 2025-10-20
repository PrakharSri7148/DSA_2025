import java.util.*;

public class StackDeque {

    static class Stack {
        static Deque<Integer> d = new LinkedList<>();

        public static Boolean isEmpty() {
            return d.isEmpty();
        }
        
        public static void push(int data) {
            d.addLast(data);
        }

        public static int pop() {
            return d.removeLast();
        }

        public static int peek() {
            return d.getLast();
        }
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
