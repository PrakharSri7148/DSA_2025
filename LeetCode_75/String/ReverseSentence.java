public class ReverseSentence {
    public static String reverse(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        int i=0; 
        int j = arr.length-1;

        while(i<j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int m=0; m<arr.length; m++) {
            sb.append(arr[m]);
            if(m!= arr.length-1) sb.append(" ");
        }

        String str = sb.toString();
        return str;
        
    }

    public static void main(String[] args) {
        String s = "the sky is blue";

        System.out.println(reverse(s));
    }

}
