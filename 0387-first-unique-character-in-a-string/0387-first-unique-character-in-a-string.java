class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            String str=s.substring(i+1,s.length());
            String str1=s.substring(0,i);
            String c=s.charAt(i)+"";
            if(!str.contains(c)&&(!str1.contains(c)))
            {
                return i;
            }
        }
        return -1;
    }
}