package gsCoderPadQA;

public abstract class LongestPalindromeSubstring {
    public abstract void find1();
    public void find1(int a){

    }
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalSubStr(s));
    }
    static String longestPalSubStr(String str){
        int n = str.length();

        int maxLength = 1, start = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){

                if(checkPal(str, i, j) && (j-i+1) > maxLength){
                    start = i;
                    maxLength = j-i+1;
                }
            }
        }
        return str.substring(start, start+maxLength);
    }
    static boolean checkPal(String s, int low, int high){
        while (low < high){
            if(s.charAt(low) != s.charAt(high))
                return false;
            low ++;
            high --;
        }
        return true;
    }


}
class ad extends LongestPalindromeSubstring{

    @Override
    public void find1() {

    }
}