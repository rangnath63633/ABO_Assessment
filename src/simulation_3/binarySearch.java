package simulation_3;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 15, 20, 30, 50};
        int n= 15;
        System.out.println(searchBinary(arr, n));
    }
    public static int searchBinary(int[] arr, int n){
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
