package gsCoderPadQA;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2,2,4,5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m+n];
        int i=0, k=0, g=0;

//        while (i < arr3.length){
//            if(i<m){
//                arr3[i++] = arr1[k++];
//            }else{
//                arr3[i++] = arr2[g++];
//            }
//        }
//        Arrays.sort(arr3);


        while (k<m && g<n){
            if(arr1[k] < arr2[g]){
                arr3[i++] = arr1[k++];
            }else{
                arr3[i++] = arr2[g++];
            }
        }

        if(arr3.length %2 == 1){
            return arr3[arr3.length/2];
        }else{
            return (arr3[arr3.length/2-1] + arr3[arr3.length/2])/2.0;
        }
    }

}
