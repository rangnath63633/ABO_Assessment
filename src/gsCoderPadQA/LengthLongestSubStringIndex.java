package gsCoderPadQA;

import java.util.HashMap;
import java.util.Map;

public class LengthLongestSubStringIndex {
    public static void main(String[] args) {
        String str = "aabbbbCCCCCdddddddd";
        System.out.println(findIndexLengthLongestSubString(str));
    }
    public static int findIndexLengthLongestSubString(String str){
        int position = -1;
        int maxCount =0;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                position = str.indexOf(entry.getKey());
                maxCount = entry.getValue();
            }
        }
        if(position != -1)
            System.out.println(str.substring(position, position+maxCount));
        return position;

    }

    private static void longestSubstring(String s) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;        }
            else {
                if (count > max) {
                    max = Math.max(max, count);
                    index = Math.abs(count-i)+1;
                    count = 1;
                }
            }
        }
        System.out.println(index+"  "+max);}
}
