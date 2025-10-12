import java.util.*;

public class linear_Search {
    public static int linearSearch(int nums[], int target) {
		for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
            return i;
        }
        }
        return -1;
    }


    public static void main(String[] args) {

        int nums[] = {1,45,64,6,4,8};
        int target = 64;

        int result = linearSearch(nums, target);

        System.out.println(result);
    }
}

