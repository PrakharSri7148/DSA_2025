import java.util.*;

public class Histogram {
    
    public static void nextSmallerRight(int[] arr, int[] nsr) {
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            
            while(!s.isEmpty() && (arr[s.peek()]>arr[i])) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } 
            else{
                
                nsr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallerLeft(int[] arr, int[] nsl) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++) {

            while(!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            }
            else{
                
                nsl[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static int maxArea(int[] nsr, int[] nsl, int[] arr) {
        int greatest = 0;
        for(int i=0; i<arr.length; i++){
            int width = (nsr[i] - nsl[i] -1);
            int area = arr[i] * width;
            greatest = Math.max(greatest, area);
        }
        return greatest;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};  //heights in histogram
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        nextSmallerRight(arr, nsr);  
        nextSmallerLeft(arr, nsl);

        int result = maxArea(nsr, nsl, arr);
        System.out.println(result);

    }
}
