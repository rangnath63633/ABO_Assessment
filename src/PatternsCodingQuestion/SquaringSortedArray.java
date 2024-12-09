package PatternsCodingQuestion;

import java.util.Arrays;

public class SquaringSortedArray {
    public static void main(String[] args) {
     //   int[] arr = {-2, -1, 0, 2, 3};
        int[] arr = {-3, -1, 0, 1, 2 };
        int count=0;
        for(int i : findSquaringSortedArray(arr)) {
            System.out.print(i );
            if (count < arr.length - 1) {
                System.out.print(", ");
            }
            count++;
        }
    }

    public static int[] findSquaringSortedArray(int[] arr){
        int[] squaringArray = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            squaringArray[i] = arr[i] * arr[i];
        }
        Arrays.sort(squaringArray);
        return squaringArray;
    }
}
