class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            int a = sum+nums[i];
            sum = sum+nums[i];
             nums[i] = a;
        }
        return nums;
    }
}