import java.util.*;

public class NextGreaterElement {

    public static void greaterElement(int[] arr, int[] result) {
        Stack<Integer> s = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                result[i] = -1;
            }
            else{
                int greaterElement = arr[s.peek()];
                result[i] = greaterElement;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 0, 2, 6};
        int result[] = new int[arr.length];

        greaterElement(arr, result);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
