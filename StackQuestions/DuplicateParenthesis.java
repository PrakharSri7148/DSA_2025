import java.util.*;

public class DuplicateParenthesis {
    
    public static Boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == 'a' || ch == 'b' || ch == '+') {
                s.push(ch);
            }
            else{
                int count = 0;
                while( s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1) {
                    return false;
                }
                else{
                    s.pop();
                }
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(a+b)";
        Boolean result = isValid(str);
        System.out.println(result);
    }
}
