class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i=0;
        for(int x:hours)
        {
            if(x>=target)
            {
                i++;
            }
        }
        return i;
    }
}