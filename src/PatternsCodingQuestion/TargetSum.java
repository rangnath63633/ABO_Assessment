package PatternsCodingQuestion;

import java.util.Arrays;
import java.util.Collections;

public class TargetSum {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = {2,1,4,3,6,5};
        int targetSum = 6;
        toFindTargetSumEqualToPairSum(arr, targetSum);
    }
    public static void toFindTargetSumEqualToPairSum(int[] arr, int targetSum){

//            int targetSum = arr[arr.length-1];
            Arrays.sort(arr);
            int j=arr.length-1;
            for(int i=0; i<arr.length;){
                int pairSum = arr[i] + arr[j];

                if(targetSum == pairSum){
                    System.out.println(arr[i]+"+"+arr[j]+"== target sum, we found our pair");
                    break;
                } else if (pairSum > targetSum) {
                    j--;
                    if(j == 0)
                        break;
                }else {
                    i++;
                }
            }
    }
}
