class Solution {
    public int[] intersect(int[] a, int[] b) {
        Arrays.sort(a);
         Arrays.sort(b);
         ArrayList<Integer> ans =new ArrayList<>();
        int prt1=0,prt2=0;
        int al=a.length,bl=b.length;
        while(prt1<al&&prt2<bl)
        {
            if(a[prt1]==b[prt2])
            {
                ans.add(a[prt1]);
                prt1++;prt2++;
            }
            else{
                if(a[prt1]<b[prt2])
                {
                    prt1++;
                }
                else{
                    prt2++;
                }
            }
        }
        int i=0;
        int arr[]=new int[ans.size()];
        for(int x:ans)
        {
            arr[i++]=x;
        }
        return arr;
    }
}