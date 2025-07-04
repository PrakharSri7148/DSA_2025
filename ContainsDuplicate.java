import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int rd =0;
        for(int i=1; i<nums.length; i++) {
            if(nums[rd] == nums[i]){
               return true;
            }
            rd ++;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2,2,3,1};

        Boolean result = containsDuplicate(nums);

        System.out.println(result);



    }
}
