package gs_coderpad_questions;
/*
Given a sentence/phrase and two words,
    return the minimum distance between the words.

Example:
    String str = “the quick the brown quick brown the frog”
    String word1 = “quick”
    String word2 = "frog"

    //Return 2


 */
public class MinimumDistanceBetweenWords {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

        int distance = minDistance(str, word1, word2);
        System.out.println("Minimum distance: " + distance);
    }

    public static int minDistance(String str, String word1, String word2) {
        String[] words = str.split(" ");
        int lastPosWord1 = -1;
        int lastPosWord2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                lastPosWord1 = i;
                if (lastPosWord2 != -1) {
                    minDistance = Math.min(minDistance, lastPosWord1 - (lastPosWord2-1));
                }
            } else if (words[i].equals(word2)) {
                lastPosWord2 = i;
                if (lastPosWord1 != -1) {
                    minDistance = Math.min(minDistance, (lastPosWord2-1) - lastPosWord1);
                }
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

}
