import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Find next greater element for every element in nums2
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // Find next greater element
            if (stack.isEmpty()) {
                map.put(element, -1);
            } else {
                map.put(element, stack.peek());
            }

            // Put current element into stack
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