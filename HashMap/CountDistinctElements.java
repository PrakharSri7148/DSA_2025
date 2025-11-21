import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int nums[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        for(int i=0; i<nums.length; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            }
            else hm.put(nums[i], hm.get(nums[i])+1);
        }

        Set<Integer> keys = hm.keySet();

        int sum =0;
        for (Integer i : keys) {
            sum++;
        }
        System.out.println(sum);
    }
}
