package gsCoderPadQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumeratorDenominator {
    public static void main(String[] args) {
// 101000
        short a=10;
        short b=10;
//a+=b;//a=a+b internally so fine
        a=(short)(a+b);//Compile time error because 10+10=20 now int
        System.out.println(a);

        int Numerator = 50, Denominator = 22;
        System.out.println(toFindNumeratorDenominatorFraction(Numerator, Denominator));
    }
    public static String toFindNumeratorDenominatorFraction(int numerator, int denominator){
        if(numerator == 0)
            return "0";
        StringBuilder sb = new StringBuilder();

        if((numerator < 0) ^ (denominator<0))
            sb.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        return "";
    }
}
