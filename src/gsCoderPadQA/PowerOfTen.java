package gsCoderPadQA;

import java.util.Date;

public class PowerOfTen {
    public static void main(String[] args) {
        int number = 1000000;
        if (isPowerOfTen(number)) {
            System.out.println(number + " is a power of 10.");
        } else {
            System.out.println(number + " is not a power of 10.");
        }
    }
    public static boolean isPowerOfTen(int num){
        if(num <= 0){
            return false;
        }
        double logValue = Math.log10(num);
        return logValue == (int) logValue;
    }
}
