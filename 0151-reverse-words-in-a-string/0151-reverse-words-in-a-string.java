class Solution {
    
    public String reverseWords(String s) {
        String [] str=s.split(" ");
        String rev="";
        // String sp=" ";
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i].isEmpty()) continue;
                rev=rev+" "+str[i].trim();
            
        }
        return rev.trim();
    }
}