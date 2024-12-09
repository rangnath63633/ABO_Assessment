package gsCoderPadQA;

public class StringLengthEncoding {
    public static void main(String[] args) {
        String input1 = "aabbbab";
        System.out.println(toFindStringLengthEncoding(input1));
    }
    public static String toFindStringLengthEncoding(String str){
        int count=1;
        char currentChar = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<str.length(); i++){
            if(currentChar == str.charAt(i)){
                count++;
            }else{
                sb.append(currentChar).append(count);
                currentChar=str.charAt(i);
                count=1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
}
