class Solution {
    boolean b = false;
    void find(int[][] grid1, int[][] grid2 , int i , int j)
    {
        if(i<0 || j<0 || i>= grid1.length || j>=grid1[0].length )
        return ;
        if(grid2[i][j]==0) return ;
        if(grid1[i][j]==0 && grid2[i][j]==1) b = true;
         grid2[i][j]=0;
         find(grid1, grid2, i+1 ,j);
        find(grid1, grid2, i-1,j);
        find(grid1,grid2, i,j+1);
        find(grid1 ,grid2 ,i , j-1);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for(int i =0 ;i<grid1.length;i++)
        {
            for(int j=0;j<grid1[0].length ;j++)
            {
                if(grid2[i][j]==1)
                {
                 find(grid1 ,grid2 , i,j );
                 if(b==false)
                 {
                 count++;
                 }
                } 
                b= false;                   
            }
        }
        return count;
    }
}