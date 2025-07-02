import java.util.Scanner;

public class arrays_second_largest_element {
    public static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        int sec_largest = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>sec_largest && nums[i]!=largest){
                sec_largest = nums[i];
            }
        }
        return sec_largest;
        }    
    
    public static void main(String[] args) {
        int nums[] = {8, 8, 7, 6, 5};

        int second_largest_element = secondLargestElement(nums);

        System.out.println(second_largest_element);
    }
}
