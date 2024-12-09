package gsCoderPadQA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatingCharacterInString {
    public static void main(String[] args) {
        String input = "aabbccdeeff";
        System.out.println(toFindNonRepeatingCharacterInString(input));
    }
    public static char toFindNonRepeatingCharacterInString(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
//        }
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
//        for(Map.Entry<Character,Integer> e: map.entrySet()){
//            if(e.getValue() == 1){
//                System.out.println(e.getKey());
//            }
//        }
        for (char ch :str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '\0';

    }
    public static char toFindFirstNonRepeatingCharInString(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> en : map.entrySet()){
            if(en.getValue() == 1){
                return en.getKey();
            }
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }

}
