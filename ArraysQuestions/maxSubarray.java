public class maxSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(sum >=0){
                sum += nums[i];
            }

            else{
                sum = nums[i];
            }

            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(nums);

        System.out.println(result);

    }
    
}
