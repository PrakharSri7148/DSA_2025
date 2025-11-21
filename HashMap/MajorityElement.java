import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int n = (arr.length)/3;

        for(int i=0; i<arr.length; i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else hm.put(arr[i], hm.get(arr[i])+1);
        }

        Set<Integer> keys = hm.keySet();

        for (Integer k : keys) {
            if(hm.get(k)>n) System.out.println(k);
        }
    }
}
