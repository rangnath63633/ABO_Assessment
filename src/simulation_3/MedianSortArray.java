package simulation_3;

import java.util.Arrays;

public class MedianSortArray {

    public static void main(String[] args) {
        int[] arr1 ={1,4,5,6};
        int[] arr2 = {8,8,9};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    public static int findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length == 0 && arr2.length == 0) {
            throw new IllegalArgumentException("Both arrays are empty.");
        } else if (arr1.length == 0) {
            return findMedianSingleArray(arr2);
        } else if (arr2.length == 0) {
            return findMedianSingleArray(arr1);
        }

        if (arr1.length > arr2.length) {
            //This is done because binary search is performed on the smaller array to minimize the number of computations and reduce complexity.
            return findMedianSortedArrays(arr2, arr1);
        }

        int n1 = arr1.length;
        int n2 = arr2.length;


//int[] arr2 = {8,8,9};

        int low = 0;
        int high = n1;

        while (low <= high) {
            int partition1 = (low + high) / 2; //arr1=1
            int partition2 = (n1 + n2 + 1) / 2 - partition1;//arr2=3

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : arr1[partition1 - 1];
            int minRight1 = (partition1 == n1) ? Integer.MAX_VALUE : arr1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : arr2[partition2 - 1];
            int minRight2 = (partition2 == n2) ? Integer.MAX_VALUE : arr2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Check if total number of elements is odd
                if ((n1 + n2) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    // Even case: return the average of the two middle elements
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                }
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }

        return -1;
    }

    // Handle case when only one array is present
    private static int findMedianSingleArray(int[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
    }




}
































// we calculate partition2 for arr2 such that the total number of elements on the left side of
// both partitions (partition1 and partition2) is equal to the total number of elements on the
// right side (or they differ by 1 if the total number of elements is odd). This ensures that
// both left partitions together contain half of the elements.
//int partition2 = (n1 + n2 + 1) / 2 - partition1;

// This ensures that arr1 is the smaller array. If arr1 is larger than arr2, we swap them by
// calling findMedianSortedArrays(arr2, arr1). This is done because binary search is performed
// on the smaller array to minimize the number of computations and reduce complexity.
//        if (arr1.length > arr2.length) {
//        return findMedianSortedArrays(arr2, arr1);
//        }


//        int[] joinedArray = new int[arr1.length + arr2.length];
//
//        System.arraycopy(arr1, 0, joinedArray,0, arr1.length);
//        System.arraycopy(arr2,0,joinedArray,arr1.length,arr2.length);
//        System.out.println(Arrays.toString(joinedArray));
//
//        return joinedArray;