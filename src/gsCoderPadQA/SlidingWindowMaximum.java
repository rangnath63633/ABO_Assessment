package gsCoderPadQA;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(findMax(nums, k));
        System.out.println(findMax2(nums,k));
    }
    public static List<Integer> findMax(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // Holds indices of array elements

        for (int i = 0; i < nums.length; i++) {
            // Remove elements that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove elements from the deque that are less than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element's index to the deque
            deque.offerLast(i);

            // The maximum for the current window is at the front of the deque
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static String findMax2(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return "[]";
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            int maxNum = nums[i];

            for (int j = 1; j < k; j++) {
                maxNum = Math.max(maxNum, nums[i + j]);
            }
            result.add(maxNum);
        }

        return result.toString();
    }
}