class Solution {
    public void rotate(int[][] mat) {
        int r=mat.length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i<j)
                {
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i=0;i<r;i++)
                {

                    int s=0,e=r-1;
                   while(s<e){
                     int temp= mat[i][s];
                     mat[i][s++]=mat[i][e];
                     mat[i][e--]=temp;
                   }
        }
    }
}