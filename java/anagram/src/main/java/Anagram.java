import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> aList) {
        List<String> anagrams = new ArrayList<String>();

        char[] words = word.toLowerCase().toCharArray();
        Arrays.sort(words);
        for (String theWord : aList) {
            if (theWord.length() == word.length() && !theWord.equalsIgnoreCase(word)) {
                char[] theWords = theWord.toLowerCase().toCharArray();
                Arrays.sort(theWords);
                if (Arrays.equals(theWords,words)) {
                    anagrams.add(theWord);
                }
            }
        }

        return anagrams;
    }


}