class Solution {
    public int prefixCount(String[] words, String pref) {
       int c=0;
       String str="";
       int l=pref.length()-1;
       for(int i=0;i<words.length;i++)
       {
        str=words[i];
        if(str.contains(pref)&&str.indexOf(pref)==0)
        {
            c++;
        }
       } 
       return c;
    }
}