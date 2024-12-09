package gsCoderPadQA;

public class ShortestSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;
        System.out.println("Length of shortest subarray: " + shortestSubArrayLength(nums, k));
    }
    public static int shortestSubArrayLength(int[] nums, int k){
        int j=0, sum = 0, minLength =Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            while (sum >= k) {
                minLength = Math.min(minLength, i-j+1);
                sum  -=nums[j++];
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

}
