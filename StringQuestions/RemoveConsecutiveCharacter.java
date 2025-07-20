class RemoveConsecutiveCharacter {
    public static String deleteConsecutiveCharacter(String s) {
        StringBuilder fixed = new StringBuilder();
        fixed.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                fixed.append(s.charAt(i));
                }
        }
        return fixed.toString();
        
    }

    public static void main(String[] args) {
        String s = "aaadddbhgvvvgfb";

        String result = deleteConsecutiveCharacter(s);

        System.out.println(result);
    }
}
