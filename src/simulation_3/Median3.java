package simulation_3;

public class Median3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    public static int findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return findMedianSortedArrays(arr2, arr1);
        }

        int n1 = arr1.length;
        int n2 = arr2.length;
        int imin = 0, imax = n1, halfLen = (n1 + n2 + 1) / 2;

        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;

            if (i < n1 && arr2[j - 1] > arr1[i]) {
                imin = i + 1;
            } else if (i > 0 && arr1[i - 1] > arr2[j]) {
                imax = i - 1;
            } else {
                // i is perfect
                int maxLeft;
                if (i == 0) maxLeft = arr2[j - 1];
                else if (j == 0) maxLeft = arr1[i - 1];
                else maxLeft = Math.max(arr1[i - 1], arr2[j - 1]);

                if ((n1 + n2) % 2 == 1) {
                    return maxLeft; //odd case
                }

                int minRight;
                if (i == n1) minRight = arr2[j];
                else if (j == n2) minRight = arr1[i];
                else minRight = Math.min(arr1[i], arr2[j]);

                return (maxLeft + minRight) / 2; // Even case
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }

}
