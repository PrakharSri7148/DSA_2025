public class UniqueString {
    public static void main(String[] args) {
        String s = "asdfghjk";
        Boolean isUnique = true;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                }
            }
        }

        System.out.println(isUnique);
    }
}
