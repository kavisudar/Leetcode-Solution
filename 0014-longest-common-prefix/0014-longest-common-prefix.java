class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length-1;
        String first=strs[0];
        String last=strs[n];
        String ans="";
        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i)==(last.charAt(i)))
            {
                ans=ans+first.charAt(i);
            }
            else
            {
                break;
            }
        }
        return ans;
    }
}