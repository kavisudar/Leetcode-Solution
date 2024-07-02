class Solution {
    public boolean checkRecord(String s) {
      int counta=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='A'){
            counta++;
            if(counta>1)
                return false;
        }
        else if(i<s.length()-2)
        {
        if(s.charAt(i)=='L' &&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
            return false;
            }
      }  
        return true;
    }
}