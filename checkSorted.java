import java.util.*;

public class checkSorted {
    public static boolean isSorted(int nums[]) {
        Boolean isAscending = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                isAscending = false;
            }
        }
        return isAscending;
        
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 9, 4, 7};

        Boolean result = isSorted(nums);

        System.out.print(result);
    }
}
