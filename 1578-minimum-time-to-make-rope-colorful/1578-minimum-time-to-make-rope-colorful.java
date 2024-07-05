class Solution {
    public int minCost(String colors, int[] T) {
        int sum=0;
        int n=colors.length();
        ArrayList<Integer> arr =new ArrayList<>(;

        for(int i=0,j=0;i<n-1&&j<n-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {                                                    
                arr.add(T[i]);
                int temp=arr.get(j);
                
            }
            else{
                for(int x=0;x<arr.length-1;x++)
                {
                    sum+=arr[x];
                }
            }
        }
        return sum;
    }
}