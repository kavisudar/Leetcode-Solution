class Solution {
    public boolean canConstruct(String r, String s) {
        // StringBuilder a=new StringBuilder(r);
        StringBuilder b=new StringBuilder(s);
        for(int i=0;i<r.length();i++)
        {
            int pos=b.indexOf(r.charAt(i)+"");
            if(pos!=-1)
            {
                b.replace(pos,pos+1,"$ ");
            }
            else {
                return false;
            }
        }
        return true;
    }
}