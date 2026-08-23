class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        //twop pointers
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            currentSum += nums[high];
            high++;
            while (currentSum >= target) {
                int currentSumWindow = high - low;
                minWindow = Math.min(currentSumWindow, minWindow);
                currentSum -= nums[low];
                low++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}