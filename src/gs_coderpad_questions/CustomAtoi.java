package gs_coderpad_questions;
/*
Implement your custom atoi function in Java.
    Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive).

Examples:
    String str1 = "123";     //Return 123 (in integer format)

    String str2 = "-123";    //Return -123

    String str3 = "1a23";   //Return -1 (Invalid entry)


 */

public class CustomAtoi {
    public static void main(String[] args) {
        System.out.println(customAtoi("123"));
        System.out.println(customAtoi("-123"));
        System.out.println(customAtoi("1a23"));
        System.out.println(customAtoi("   42"));
        System.out.println(customAtoi("   -42"));
        System.out.println(customAtoi("4193 with words"));
        System.out.println(customAtoi("words and 987"));
    }

    public static int customAtoi(String str) {
        str = str.trim();
        if (str.isEmpty())
            return -1;

        int sign = 1;
        int index = 0;
        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        }

        long result = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            if (!Character.isDigit(ch)) {
                return -1;
            }

            result = result * 10 + (ch - '0');

            if (result * sign < Integer.MIN_VALUE || result * sign > Integer.MAX_VALUE) {
                return -1;
            }

            index++;
        }

        return (int)(result * sign);
    }
}
