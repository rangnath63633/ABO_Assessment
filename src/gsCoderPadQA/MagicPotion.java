package gsCoderPadQA;

public class MagicPotion {
    public static void main(String[] args) {
        String str = "aabbaacc";
      //  System.out.println(findEncoding(str));

        System.out.println(minimalSteps("aabbaacc"));
        System.out.println(minimalStepsDemo("aabbaacc"));
    }

    private static Integer minimalSteps(String ingredients) {

        int n = ingredients.length();
        if (n == 0) {
            return 0;
        }
        StringBuilder magicPotion = new StringBuilder();
        magicPotion.append(ingredients.charAt(0));

        for (int i = 1; i < n; i++) {

            if (i * 2 <= n) {
                String stringToCompare = ingredients.substring(0, i);
                // System.out.println(stringToCompare+"\t"+ingredients.substring(i, 2 * i));
                if (stringToCompare.equals(ingredients.substring(i, 2 * i))) {
                    magicPotion.append("*");
                    i = 2*i - 1; //a -1 here as there is already a ++i in for loop
                } else {
                    magicPotion.append(ingredients.charAt(i));
                }
            } else { //i*2 has crossed n, simply add the characters
                magicPotion.append(ingredients.charAt(i));
            }
        }
        // System.out.println();
        System.out.println(ingredients + "\t" + magicPotion);

        return magicPotion.length();
    }

    private static Integer minimalStepsDemo(String ingredients) {
        int n = ingredients.length();

        if (n == 0 ){
            return 0;
        }
        StringBuilder magicPotion = new StringBuilder();
        magicPotion.append(ingredients.charAt(0));
        for (int i = 1; i < ingredients.length(); i++) {

            if (i*2 <= n) {
                String stringToCompare = ingredients.substring(0,i);
                if (stringToCompare.equals(ingredients.substring(i, i*2))) {
                    magicPotion.append("*");
                    i = i*2 - 1;
                } else {
                    magicPotion.append(ingredients.charAt(i));
                }
            } else {
                magicPotion.append(ingredients.charAt(i));
            }
        }
        return magicPotion.length();
    }
}



//public static String findEncoding(String str){
//
//    int n = str.length();
//    String result = str;
//    for(int len=1; len<=n/2; len++){
//        String substr = str.substring(0, len);
//        int count=0;
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0; i<n;){
//            if(i+len <= n && str.substring(i, Math.min(i+len, n)).equals(substr)){
//                count++;
//                i+=len;
//            }else {
//                if(count > 0){
//                    sb.append(count).append("[").append(substr).append("]");
//                    count=0;
//                }
//
//                sb.append(str.charAt(i));
//                i++;
//            }
//        }
//        if(count > 0){
//            sb.append(count).append("[").append(substr).append("]");
//        }
//        System.out.println(sb);
//        if (sb.length() < result.length()){
//            result = sb.toString();
//        }
//    }
//    System.out.println(result);
//    return result;
//}