import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        String s = "race";
        String t = "care";

        for(int i=0; i<t.length(); i++) {
            if(!hm1.containsKey(t.charAt(i))) {
                hm1.put(t.charAt(i), 1 );
            }
            else hm1.put(t.charAt(i), hm1.get(t.charAt(i))+1);
        }

        for(int i=0; i<s.length(); i++) {
            if(!hm2.containsKey(s.charAt(i))) {
                hm2.put(s.charAt(i), 1 );
            }
            else hm2.put(s.charAt(i), hm2.get(s.charAt(i))+1);
        }

        if(hm1.equals(hm2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        

    }
}
