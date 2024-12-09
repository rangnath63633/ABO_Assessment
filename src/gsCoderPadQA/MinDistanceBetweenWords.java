package gsCoderPadQA;

public class MinDistanceBetweenWords {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy is is is dog";
        String word1 = "the";
        String word2 = "dog";
        System.out.println(toFindMinDistanceBetweenTwoWords(text, word1, word2));
        System.out.println(toFindMinDistanceBetweenTwoWords2(text, word1, word2));
    }
    public static int toFindMinDistanceBetweenTwoWords(String text, String word1, String word2) {
        String[] words = text.split(" ");
        int word1Index = -1;
        int word2Index = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                word1Index = i;
            }
            if (words[i].equals(word2)) {
                word2Index = i;
            }
            if (word1Index != -1 && word2Index != -1) {
                int midPoint1 = word1Index + words[word1Index].length() / 2;
                int midPoint2 = word2Index + words[word2Index].length() / 2;
                int distance = Math.abs(midPoint1 - midPoint2);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        return (word1Index != -1 && word2Index != -1) ? minDistance : -1; // return -1 if one or both words are not found
    }

    public static int toFindMinDistanceBetweenTwoWords2(String text, String word1, String word2) {
        String[] words = text.split(" ");
        int word1Index = -1;
        int word2Index = -1;
//        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                word1Index = i;
            }
            if (words[i].equals(word2)) {
                word2Index = i;
            }
        }
        return (word2Index - 1) - word1Index;
    }

    public static int toFindMinDistanceBetweenTwoWords3(String text, String word1, String word2){

        String[] words = text.split(" ");
        int i=0;
        int word1Index = -1;
        int word2Index = -1;
        while (i<words.length){
            if(words[i].equals(word1)){
                word1Index = i;
            }
            if(words[i].equals(word2)){
                word2Index = i;
            }
        }
        return (word2Index-1)-word1Index;
    }
}
