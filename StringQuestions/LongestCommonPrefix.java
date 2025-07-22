import java.util.*;

class LongestCommonPrefix {
    public static String commonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i] == last[i]){
                sb.append(first[i]);
            }
            else{
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        String result = commonPrefix(strs);

        System.out.println(result);
    }
}
