class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] num = new int[nums.length+nums.length];
     for( int i =0;i<nums.length;i++)
     {
        num[i] = nums[i];
     }
     int j = 0;
     for(int k = nums.length;k<nums.length+nums.length;k++)
     {
        num[k] = nums[j];
        j++;
     }
        return num;
    }
}