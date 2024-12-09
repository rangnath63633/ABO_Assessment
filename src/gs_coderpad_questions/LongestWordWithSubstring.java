package gs_coderpad_questions;


//Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
//
//Example:
//String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"}
//String toSearch = "ODG";
//Returns 9 (LODGESSSS)

public class LongestWordWithSubstring {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        int longestLength = findLongestWordLength(dict, toSearch);
        System.out.println(longestLength);
    }


public static int findLongestWordLength(String[] dict, String toSearch) {
    int maxLength = 0;
    String result = "";

    for (String word : dict) {
        if (word.toUpperCase().contains(toSearch.toUpperCase())) {
            maxLength = Math.max(maxLength, word.length());
            result = word;
        }
    }
    System.out.println(result);
    return maxLength;
}
}
