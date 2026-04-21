class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder s1 = new StringBuilder();
        s = s.trim();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                s1.setLength(0);
            }
            else
            {
                s1.append(s.charAt(i));
            }
        }
        return s1.length();
    }
}