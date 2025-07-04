import java.util.*;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums.length -k;
        return(nums[nums.length -k]);
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k =2;

       int solution = findKthLargest(nums, k);

       System.out.println(solution);
    } 
}

