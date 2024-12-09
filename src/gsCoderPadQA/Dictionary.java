package gsCoderPadQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {
    public static void main(String[] args) {
//        Given a dictionary (list of words) and a word,
//        return an array of strings that can be formed from the given word.
//    [Every letter in the input word can occur only once in the word to be returned].


        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        // Return {"abcd", "bcad"}

//        String[] dict =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
//        String input = "caab";
        // Return {"acab"}

        List<String> result =toFindWordInDict(dict,input);
        System.out.println(result);
//System.out.println(Arrays.toString(result));
        for (String s : result)
            System.out.println(s);
    }
    public static List<String> toFindWordInDict(String[] dict, String input){
        int num=0;

        List<String > s = new ArrayList<>();

        String sortInput = sortString(input);

        for(int i=0; i<dict.length; i++){
            if(dict[i].length() == input.length()){
                String sortWord = sortString(dict[i]);

                if(sortWord.equals(sortInput)){
                    s.add(dict[i]);
                }
            }
        }
        return s;
    }

    private static String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
