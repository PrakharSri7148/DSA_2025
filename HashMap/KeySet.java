import java.util.*;

public class KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);  
        hm.put("China", 100);
        hm.put("Nepal", 75);
        hm.put("Indonesia", 100);
        hm.put("Pakistan", 29);
        hm.put("Brazil", 27);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(k+" "+"->"+hm.get(k));
        }
    }
}
