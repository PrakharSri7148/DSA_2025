import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);   //add function
        hm.put("China", 100);
        hm.put("Nepal", 75);

        System.out.println(hm);

        System.out.println(hm.get("India"));   //get funtion


        System.out.println(hm.containsKey("India"));  //containsKey fn

        hm.remove("Nepal");   //delete fn
        System.out.println(hm);

        System.out.println(hm.size());  //size fn

        System.out.println(hm.isEmpty());  // to check if its empty

        hm.clear();      //clear all the data from hashmap
        System.out.println(hm);
    }
}
