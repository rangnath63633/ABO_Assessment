package LeetCodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));
        System.out.println(lengthOfLongestSubstring2(input));

    }
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        if(n<2){
            return n;
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();
        while (right < n){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                maxLength = Math.max(maxLength, right-left);
                left = Math.max(left, map.get(ch)+1);
            }

            map.put(ch, right);
            right++;
        }
        return Math.max(maxLength, right-left);
    }

    public static int lengthOfLongestSubstring2(String s) {
        boolean[] ss = new boolean[128];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            char c = s.charAt(j);
            while (ss[c]) {
                ss[s.charAt(i++)] = false;
            }
            ss[c] = true;
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }

}
