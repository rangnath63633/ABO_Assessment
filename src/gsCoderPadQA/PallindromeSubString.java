package gsCoderPadQA;

public class PallindromeSubString {

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";

        String[] result = findLongestPalindrome(str);
        System.out.println("Longest Palindromic Substring: " + result[0]);
        System.out.println("Length of Longest Palindrome: " + result[1]);
    }
    public static String[] findLongestPalindrome(String str){
        if(str == null || str.isEmpty())
            return new String[]{"", "0"};

        int start =0, end =0;
        for(int i=0; i<str.length(); i++){
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i+1);
            int len = Math.max(len1, len2);

            if(len > end - start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        String longestPalindrome = str.substring(start, end+1);
        String length = String.valueOf(longestPalindrome.length());
        return new String[]{longestPalindrome, length};
    }
    private static int expandAroundCenter(String str, int left, int right){
        while (left >= 0 && right < str.length() &&
                str.charAt(left) == str.charAt(right)){

            left--;
            right++;

        }
        return right-left-1;
    }
}
