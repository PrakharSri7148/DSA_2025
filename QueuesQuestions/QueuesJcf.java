import java.util.*;
public class QueuesJcf {
    public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();   //ArrayDeque is also a way to implement 
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
