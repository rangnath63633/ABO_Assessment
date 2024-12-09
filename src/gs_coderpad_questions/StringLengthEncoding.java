package gs_coderpad_questions;

import java.util.LinkedHashMap;
import java.util.Map;
/*

Convert a string as given in the format below:

Example:
aabbb into a2b3
aaaa into a4
a into a1
 */
public class StringLengthEncoding {

    public static String findStringLengthEncoding(String str){
        //aabbbycyyc

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
      //  char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
    public static void main(String[] args) {
            String s = "aabbbycyyc";
            System.out.println(findStringLengthEncoding(s));
    }
}
