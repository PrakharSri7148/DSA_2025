class RotateString {
    public static boolean checkRotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return((s+s).contains(goal));
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        Boolean result = checkRotateString(s, goal);

        System.out.println(result);
    }
}