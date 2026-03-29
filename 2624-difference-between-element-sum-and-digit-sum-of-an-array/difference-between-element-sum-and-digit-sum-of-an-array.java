class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            int a = nums[i];
            while(a != 0)
            {
                count = count+a%10;
                a = a/10;
            }
        }
        return sum-count;
    }
}