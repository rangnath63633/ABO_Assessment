package gsCoderPadQA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringIndex {
    public static void main(String[] args) {
        String str = "aabbbbCCCCCddd"; //
//         starting index -> and char
        findLongestSubStringIndex(str);
//
//        String input = "hello word";
//        String result ="";
//
//        for(int i=input.length()-1; i>=0; i--){
//            result +=input.charAt(i);
//        }
//        System.out.println(result);


//        String str = "abcd";
//        int strLength = str.length()-1 ;
//        System.out.println(strLength);
//        StringBuilder sb = new StringBuilder( strLength );
//        for( int i = strLength; i >= 0; )
//        {
//            System.out.println(str.charAt(i));
//            sb.append(str.charAt(i--));
//            strLength += i;
//        };
//        System.out.println(sb.toString());

    }
    public static void findLongestSubStringIndex(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        int max =0;
        char c = 0;
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() > max){
                max = m.getValue();
                c = m.getKey();
            }
        }
        int index = str.indexOf(c);
        String res = str.substring(index, index+max);
        System.out.println(index+", "+res);
    }
}
