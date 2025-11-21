public class StringPalindromeCheck {
    public static void main(String[] args) {
        String s = "akkkkb";
        Character[] arr;
        int j=0;
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                j++;
                System.out.println("Invalid Palindromes");
                break;
            }
        }

        if(j==0) System.out.println("Valid Palindromes");
    }
}
