import java.util.*;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int B[] = {1, 2, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for(int i=0; i<A.length; i++) {
            result += Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum absolute difference: "+result);
    }
}
