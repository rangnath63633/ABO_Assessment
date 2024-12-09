package gsCoderPadQA;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));            // 42
        System.out.println(myAtoi("   -42"));        // -42
        System.out.println(myAtoi("4193 with words")); // 4193
        System.out.println(myAtoi("words and 987"));  // 0
        System.out.println(myAtoi("-91283472332"));   // -2147483648 (Integer.MIN_VALUE)

    }
    public static int myAtoi(String s){
        if(s==null || s.isEmpty()){
            return 0;
        }
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int index=0, sign=1, total = 0;
        if(s.charAt(index) == '+' || s.charAt(index)=='-'){
            sign = (s.charAt(index) == '+') ? 1 : -1;
            index++;
        }

        while (index < s.length()){
            int digit = s.charAt(index) - '0';

            if(digit < 0 || digit > 9){
                break;
            }
            if(total > (Integer.MAX_VALUE - digit)/10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total*10-digit;
            index++;
        }
        return total * sign;
    }
}
