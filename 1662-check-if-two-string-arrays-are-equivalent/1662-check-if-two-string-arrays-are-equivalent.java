class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str="";
        String st="";
        for(int i=0;i<word1.length;i++)
        {
            str+=word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            st+=word2[i];
        }
        return st.equals(str);
    }
}