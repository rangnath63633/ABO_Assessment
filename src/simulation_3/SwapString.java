package simulation_3;

import java.util.Arrays;

public class SwapString {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "bca";

        System.out.println(toFindCloseStrings(word1, word2));
    }

    public static boolean toFindCloseStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        boolean[] charSet1 = new boolean[26];
        boolean[] charSet2 = new boolean[26];

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            charSet1[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            charSet2[c - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (charSet1[i] != charSet2[i]) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
