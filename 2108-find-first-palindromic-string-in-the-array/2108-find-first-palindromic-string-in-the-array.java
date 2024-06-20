class Solution {
    static boolean Palindrome(String s)
        {
            int l=0;
            int r=s.length()-1;
            while(l<=r)
            {
                if(s.charAt(l)==s.charAt(r))
                {
                    l++;r--;
                }
                else{return false;}
            }
            return true;
        }
    public String firstPalindrome(String[] words)
     {
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(Palindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
}