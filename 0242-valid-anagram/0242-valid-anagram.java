class Solution
 {
    public boolean isAnagram(String s, String t) 
    {
        int n=t.length();
        int m=s.length();
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        int count=0;
        Arrays.sort(arr2);
        if(n==m)
        {
        for(int i=0;i<n;i++)
        {
            if(arr1[i]==arr2[i])
            {
                count++;
            }
        }
        }
        if(count==n)
            return true;
        else
            return false;
    }
}
