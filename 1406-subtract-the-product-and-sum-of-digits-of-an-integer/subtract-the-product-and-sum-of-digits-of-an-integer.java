class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1 ;
        int sum = 0;
        int n1 = n;
        List<Integer> l1 = new ArrayList<>();
        while(n != 0)
        {
            int a = n%10;
            l1.add(a);
            n = n/10;
        }
        Collections.reverse(l1);
         for( int i = 0;i<l1.size();i++)
         {
            sum = sum+l1.get(i);
            product = product*l1.get(i);
         }
         return product-sum;
    }
}