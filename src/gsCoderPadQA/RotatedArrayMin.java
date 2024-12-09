package gsCoderPadQA;

public class RotatedArrayMin {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum element: " + findMin(nums));
    }
    public static int findMin(int[] arr){
        int low=0;
        int high=arr.length-1;

        while(low < high){
            int mid = low + (high-low)/2;

            if(arr[mid] > arr[high]){
                low = mid+1;
            }else if(arr[mid] < arr[high]){
                high = mid;
            }else {
                high--;
            }
        }
        return arr[low];
    }
}
