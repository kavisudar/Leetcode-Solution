class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0,j=1;j<n&&i<n;j++,i++)
        {
            int c=(int)s.charAt(i);
            int h=(int)s.charAt(j);
            int a=Math.abs(c-h);
            sum+=a;
        }
        return sum;
    }
}