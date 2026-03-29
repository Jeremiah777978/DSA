class Solution {
    public boolean canAliceWin(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        for( int i =0;i<nums.length;i++)
        {
             if(nums[i]<10)
             {
                num1 = num1+nums[i];
             }
             else
             {
                num2 = num2+nums[i];
             }
        }
        if( num1 == num2 )
        {
            return false;
        }
        return true;
    }
}