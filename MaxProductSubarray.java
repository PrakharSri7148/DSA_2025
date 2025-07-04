public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxResult = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int product =1;
            for(int j=i; j<nums.length; j++){
                product = product*nums[j];
                maxResult = Math.max(maxResult, product);
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {
        
        int nums[] = {2,3,-2,4};

        int result = maxProduct(nums);

        System.out.println(result);
    }
}
