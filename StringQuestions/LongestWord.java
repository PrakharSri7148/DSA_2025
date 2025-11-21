public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Programming is fun";
        String[] words = sentence.split(" ");

        String Longest = "";

        for (String word : words) {
            if(word.length() > Longest.length()) Longest = word;
        }

        System.out.println("Longest Word: "+ Longest);
    }
}
