package gs_coderpad_questions;
/*
Given a sorted rotated array,
    return the minimum element from it.

Examples:
    int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

    int[] arr2 = {1, 2, 3, 4};            //Return 1


 */
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        System.out.println("Minimum element: " + findMin(arr1));

        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Minimum element: " + findMin(arr2));
    }
    public static int findMin(int[] arr){

        int smallestArray = arr[0];
        for(int i=1; i<arr.length; i++){
            if(! (smallestArray < arr[i])){
                smallestArray = arr[i];
            }
        }
        return smallestArray;
    }
//    public static int findMin(int[] nums) {
//        int left = 0, right = nums.length - 1;
//
////        if (nums[left] < nums[right]) {
////            return nums[left];
////        }
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] > nums[right]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return nums[left];
//    }
}
