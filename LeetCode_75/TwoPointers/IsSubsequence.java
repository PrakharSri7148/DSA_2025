public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
        int count =0;
        Boolean result = true;

        while(i< s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j) ) {
                i++;
                j++;
                count++;
            }
            
            else j++;
        }

        if(count != s.length()) result = false;

        return result;
    }

    public static void main(String[] args) {
        String s= "abc";
        String t= "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
