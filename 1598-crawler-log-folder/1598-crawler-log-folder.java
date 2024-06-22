class Solution {
    public int minOperations(String[] logs) {
        // Stack<Integer> st = new Stack<Integer>();
        int count=0;
        for(int i=0;i<logs.length;i++)
        {
            
            if(logs[i].equals("./"))
            {
                continue;
            }
            else if(logs[i].equals("../"))
            {
                count--;
            }
            else{
                count++;
            }
            // if((logs[i].equals("../")) && (log[i+1].equals("../")))
            // {
            //     continue;
            // }
        }
        return count=(count<0)? 0:count;
    }
}