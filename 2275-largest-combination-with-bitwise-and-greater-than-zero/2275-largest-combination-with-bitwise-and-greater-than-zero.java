import java.util.*;
class Solution 
{
    public int largestCombination(int[] arr) 
    {
        int bin[]=new int[32];
          for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<32;j++)
            {
                int temp=arr[i]&(1<<j);
                if(temp!=0)
                {
                    bin[j]+=1;
                }
            }
          }
          Arrays.sort(bin);
        //   int max=Integer.MIN_VALUE;
        //   for(int x:bin)
        //   {
        //     if(max<x)
        //         max=x;
        //   }
          return bin[31];
    }
}