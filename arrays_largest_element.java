import java.util.Scanner;
public class arrays_largest_element {
    public static int largestElement(int[] nums) {
        int high = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>high){
                high = nums[i];
            }
        }
        return high;
    }
    public static void main(String args[]){
        int nums[] = {6, 4, 9, 57};

        int largest = largestElement(nums);
        System.out.print(largest);
    }
}