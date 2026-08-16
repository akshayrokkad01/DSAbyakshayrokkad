class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max=nums[0];
        int cu_max=nums[0];
        for(int i=1;i < nums.length;i++)
        {
            cu_max=Math.max(nums[i],nums[i]+cu_max);
            max=Math.max(max,cu_max);
        }
        return max;
    }
}