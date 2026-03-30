class Solution {
    public int reverseBits(int n) {
      List<Integer> l1 = new ArrayList<>();
      while( n != 0)
      {
         if(n%2 == 0)
         {
             l1.add(0);
         }
         else
         {
            l1.add(1);
         }
         n = n/2;
      }
     if(l1.size() < 32)
     {
         int a1 = 32-l1.size();
         for( int i =0;i<a1;i++)
         {
            l1.add(0);
         }
     }
      Collections.reverse(l1);
      int sum =0;
      for( int i = 0;i < l1.size();i++)
      {
        int a = (int)Math.pow(2,i);
        sum = sum + (int)l1.get(i)*a;
      }
      return sum;
    }
}