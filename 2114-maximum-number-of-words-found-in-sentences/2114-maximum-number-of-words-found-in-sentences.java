class Solution {
    public int mostWordsFound(String[] s) {
        int max=Integer.MIN_VALUE;
        int count=0;
     for(int i=0;i<s.length;i++)
     {
         String[] str=s[i].split(" ");
         for(String x:str){
            count++;
         }
         if(count>max)
         {
            max=count;
         }
         count=0;
     }   
     return max;
    }
}