import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        //How do you get distinct characters and their count in a string in Java
        String str = "aabbbcd";
        Map<Character,Integer> mp = new HashMap<>();
        int c=1;
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            Integer count = mp.get(ch);
            if(count ==null){
               mp.put(ch, c);
            } else {
                mp.put(ch,count+1);
            }
        }
        Set<Map.Entry<Character, Integer>> s = mp.entrySet();
        for(Map.Entry<Character, Integer> en:s){
            System.out.println(en);
        }

    }
}
