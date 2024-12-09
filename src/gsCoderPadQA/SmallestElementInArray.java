package gsCoderPadQA;

public class SmallestElementInArray {
    public static void main(String[] args) {
      //  int[] arr = {2, 3, 1, 5, 4};
        int[] arr = {23,34,22,40,11,9,99};
        System.out.println(findSmallestElementInArray(arr));
    }
    public static int findSmallestElementInArray(int[] arr){

        int smallestArray = arr[0];
        for(int i=1; i<arr.length; i++){
            if(! (smallestArray < arr[i])){
                smallestArray = arr[i];
            }
        }
        return smallestArray;
    }
}
