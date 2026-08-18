import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stores next greater element for each number in nums2
        Map<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            // Remove all elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(element, -1);
            } 
            else {
                // Top of stack is the next greater element
                map.put(element, stack.peek());
            }

            // Push current element
            stack.push(element);
        }

        // Build answer for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}