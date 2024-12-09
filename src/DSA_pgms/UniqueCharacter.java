package DSA_pgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "Ranganatha BR";//g t h b
        System.out.println(findUniqueChar(str));
    }
    public static String findUniqueChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            if(c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
               sb.append(m.getKey()).append(" ");
            }
        }
        return sb.toString();
    }


}
