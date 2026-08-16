class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rSet = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                rSet.add(index + 1);
            } else {
                nums[index] = nums[index] * -1;
            }
        }
        return rSet;

    }
}