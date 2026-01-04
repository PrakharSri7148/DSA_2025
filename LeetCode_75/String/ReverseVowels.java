import java.util.*;

class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;

        String vowels = "aeiouAEIOU";

        while(i<j) {
            if(vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            else if (vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        
        System.out.print("Input String: ");
        Scanner kbrd = new Scanner(System.in);
        String s = kbrd.nextLine();

        System.out.println(reverseVowels(s));
    }
}
