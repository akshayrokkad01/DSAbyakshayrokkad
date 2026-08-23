class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = 0;
        while (right < nums.length) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            right++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}