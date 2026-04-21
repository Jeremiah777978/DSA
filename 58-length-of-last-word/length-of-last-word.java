class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                count = 0;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}