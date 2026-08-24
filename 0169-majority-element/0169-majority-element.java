class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                votes++; //to assign votes=1
                majority = nums[i]; //assign new lead
            }
           else if (majority == nums[i]) //if same num = ++ ,diff num = --
            {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }
}