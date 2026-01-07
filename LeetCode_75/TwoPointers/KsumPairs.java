import java.util.Arrays;

public class KsumPairs {
    public static int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        int count = 0;

        while(i<j) {
            int sum = nums[i] + nums[j];

            if(sum == k) {
                count++;
                i++;
                j--;
            }
            else if(sum<k) i++;
            else j--;

        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        int k = 5;

        System.out.println(maxOperations(nums, k));
    }
}
