import java.util.*;

public class DequeA {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(0);
        d.addLast(3);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        
    }

}

