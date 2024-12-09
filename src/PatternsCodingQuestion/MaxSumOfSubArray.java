package PatternsCodingQuestion;

public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k=3;
        System.out.println(toFindMaxSumOfSubArray(arr, k));
//        System.out.println(toFindMaxSumOfSubArray2(arr, k));
    }
    public static int toFindMaxSumOfSubArray(int[] arr, int k){

        int pos = 0;
        int count =0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=pos; i<arr.length; i++){
            count++;
            sum +=arr[i];

            if(count == k){
                maxSum = Math.max(maxSum,sum);
                sum -=arr[pos];
                pos++;
                count--;

            }
        }
        return maxSum;
    }

    public static int toFindMaxSumOfSubArray2(int[] arr, int k){

        int maxSum = 0;
        int windowSum = 0;

        for(int i=0; i<k; i++){
            windowSum +=arr[i];
        }
        maxSum = windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum +=arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
