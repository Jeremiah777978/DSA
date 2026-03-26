class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum  = 0;
    int x1 = x;
    while(x!=0)
    {
        sum = sum+x%10;
        x=x/10;
    }
    if(x1%sum == 0)
    {
        return sum;
    }
    return -1;
    }
}