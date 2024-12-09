package gsCoderPadQA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordFinder{
    public static void main(String[] args) {
        Set<String> dict1 = new HashSet<>(Arrays.asList("ale", "apple", "monkey", "plea"));
        String str1 = "abpcplea";
        System.out.println(findLongestWord(dict1, str1));



        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        Set<String> dict2 = new HashSet<>(Arrays.asList(dict));
        String toSearch = "ODG";
        System.out.println(findLongestWord(dict2, toSearch));
    }
    public static String findLongestWord(Set<String> dict1, String str1){
        String longestWord = "";
        for(String word : dict1){
            if(canFormWord(word,str1)){
                if(word.length() > longestWord.length() ||
                        (word.length() == longestWord.length() && word.compareTo(longestWord)<0)){
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
    private static boolean canFormWord(String word, String str1){
        int i=0;
        int j=0;
        while (i<word.length() && j<str1.length()){
            if(word.charAt(i) == str1.charAt(j)){
                i++;
            }
            j++;
        }
        return i == word.length();
    }

//    public static String get(String[] str, String st){
//        String res ="";
//        for(String s:str){
//                if(s.contains(st)){
//`
//                }
//        }
//        return res;
//    }
}
