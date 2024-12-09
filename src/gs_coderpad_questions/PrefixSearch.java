package gs_coderpad_questions;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> results = findWordsWithPrefix(arr, prefix);

        System.out.println("Words starting with prefix " + prefix + " : " + results);
    }

    public static List<String> findWordsWithPrefix(String[] words, String prefix) {
        List<String> matchingWords = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith(prefix)) {
                matchingWords.add(word);
            }
        }

        return matchingWords;
    }
}
