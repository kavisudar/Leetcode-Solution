class Solution {
    public boolean isBalanced(String num) {
       int o=0;
       int e=0;
       for(int i=0;i<num.length();i++)
       {
        if(i%2==0)
            o+=num.charAt(i)-'0';
        else
            e+=num.charAt(i)-'0';
       }
        return (e==o)?true:false;
    }
}