class Solution {
    public int trailingZeroes(int n) {
        int n1 = 5;
        int sum = 0;
        int i = 2;
        while(n/n1 != 0)
        {
            sum = sum+n/n1;
            n1 = (int)Math.pow(5,i);
            i++;
        }
        return sum;
    }
}