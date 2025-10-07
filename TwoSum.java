public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    int arr[] = {i, j} ;
                    return arr;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 6, 8};
        int target = 8;

        TwoSum ts = new TwoSum();
        int result[] = ts.twoSum(arr, target);

        if(result != null) {
        System.out.print("[" + result[0]+" ");
        System.out.print(result[1]+"]");
        }
        else{
            System.out.println("No such pair is found");
        }
    }
}
