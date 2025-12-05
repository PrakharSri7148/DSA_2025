public class RemoveVowelsS {
    
    public static String removeVowels(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
    public static void main(String[] args) {
        String str = "AejfgfIou";

        System.out.println(removeVowels(str));
    }
}
