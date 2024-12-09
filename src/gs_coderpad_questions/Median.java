package gs_coderpad_questions;

/*
Find the median of two sorted arrays of different sizes.

Example:
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median
 */

public class Median {

    public static int findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = mergeArrays(arr1, arr2);

        return findMedian(mergedArray);
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    private static int findMedian(int[] merged) {
        int n = merged.length;

        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
