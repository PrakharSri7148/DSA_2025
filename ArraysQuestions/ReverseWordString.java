import java.util.*;

class ReverseWordString {
    
    public static boolean isPalindrome(String s) {
        StringBuilder fixed = new StringBuilder();

        for( char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                fixed.append(Character.toLowerCase(c));
            }
        }

        int left =0;
        int right = fixed.length()-1;

            while(left<right){
                if(fixed.charAt(left)!= fixed.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean answer = isPalindrome( s);

        System.out.println(answer);
    }
}
