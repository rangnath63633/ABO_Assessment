package gsCoderPadQA;

import java.util.Arrays;

public class SecondSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {4,9,3,1};
    //    System.out.println(findSecondSmallestInArray(arr));
    //    System.out.println(findSecondSmallestInArray2(arr));
        System.out.println(findSSEIA(arr));
    }
    public static int findSecondSmallestInArray(int[] arr){
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallestNum){
                secondSmallest = smallestNum;
                smallestNum = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static int findSecondSmallestInArray2(int[] arr){

        return Arrays.stream(arr).sorted().boxed().skip(arr.length-3).findFirst().get();
    }

    public static int findSSEIA(int[] arr){
        int smallestElement = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallestElement){
                secondSmallest = smallestElement;
                smallestElement = arr[i];
            }else if(arr[i] <secondSmallest){
                secondSmallest = arr[i];
            }
        }
      //  return secondSmallest;
        return Arrays.stream(arr).sorted().boxed().skip(1).findFirst().get();
    }
}
