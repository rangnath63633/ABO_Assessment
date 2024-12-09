package gsCoderPadQA;

public class AddTwoFractions {
    public static void main(String[] args) {
        int num1=1, den1=500, num2=2, den2=1500;
        System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
        addFraction(num1, den1, num2, den2);
    }
    public static void addFraction(int num1, int den1, int num2, int den2){

        int den3 = gcd(den1, den2);

        den3 = (den1*den2)/den3;

        int num3 = (num1) * (den3/den1) + (num2) * (den3/den2);

        lowest(den3, num3);
    }
    static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
    static void lowest(int den3, int num3){
        int common_factor =    gcd(num3, den3);
        den3 = den3/common_factor;
        den3 = num3/common_factor;

        System.out.println(num3+"/"+den3);
    }

}
