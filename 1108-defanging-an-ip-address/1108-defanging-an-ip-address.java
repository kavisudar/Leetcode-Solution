class Solution {
    public String defangIPaddr(String a) {
        int n=a.length();
        StringBuilder ar= new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)=='.')
            {
                ar.append('[');
                ar.append(a.charAt(i));
                ar.append(']');
            }
            else{
                 ar.append(a.charAt(i));
            }
        }
        return ar.toString();
    }
}