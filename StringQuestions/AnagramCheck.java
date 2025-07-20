import java.util.*;

class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        boolean check = Arrays.equals(sArr, tArr);

        return check;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println(result);
    }
}
