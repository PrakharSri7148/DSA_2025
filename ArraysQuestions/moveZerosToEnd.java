import java.util.*;

public class moveZerosToEnd {
    public static void moveZeroes(int[] nums) {
            
            if(nums.length == 0){
                return;
            }

            int z =0;
            int nz = 0;
            while(nz < nums.length){
                if(nums[nz]!=0){
                    int t= nums[nz];
                    nums[nz] = nums[z];
                    nums[z]=t;
                    nz++;
                    z++;
                }
                else {
                    nz++;
                }
            }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i] + " ");
        }

        moveZeroes(nums);

        System.out.println();
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }
}
