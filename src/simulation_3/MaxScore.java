package simulation_3;

public class MaxScore {
    public static void main(String[] args) {
//        int[] cardPoints = {1,2,3,4,5,6,1};
//        int k = 3;
        int[] cardPoints = {2,2,2};
        int k=2;
        System.out.println(findMaxScore(cardPoints, k));
    }
    public static int findMaxScore(int[] cardPoints, int k){
        int n = cardPoints.length;
        int totalSum = 0;

        for(int i=n-1; i>=n-k; i--){
            totalSum += cardPoints[i];
        }
        return totalSum;

    }
}
