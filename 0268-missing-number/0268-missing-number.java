class Solution {
    public int missingNumber(int[] nums) {
        int xa=0;

        for(int i =0;i<=nums.length;i++)// XOR all numbers till length of array
        {
            xa=xa^i;
        }
        for(int num :nums) // XOR all given array nums
        {
            xa=xa^num;
        }
        return xa; // we get a missing number 
    }
}