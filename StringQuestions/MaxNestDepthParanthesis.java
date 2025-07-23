class MaxNestDepthParanthesis {
    public static int maxDepth(String s) {
        int maxParen =0;
        int current =0;

        for(char ch: s.toCharArray()){
            if(ch == '('){
                current++;
                maxParen = Math.max(maxParen, current);
            }
            else if(ch == ')'){
                current--;
            }
        }
        return maxParen;

    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        int result = maxDepth(s);
        System.out.println(result);
    }
}