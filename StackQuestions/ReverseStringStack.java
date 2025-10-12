import java.util.*;
public class ReverseStringStack {

    public static String reverse (String str) {
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            char val = s.pop();
            result.append(val);
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String str = "abc";
        String newString = reverse(str);
        System.out.println(newString);
    }
}
