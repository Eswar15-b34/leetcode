class Solution {
    boolean t =false;
     void find(int[][] grid , int i , int j )
    {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length) { t = true;return ;}
        
        if(grid[i][j]==1) return ;
        grid[i][j]=1;
        find(grid, i+1 ,j);
        find(grid, i-1,j);
        find(grid, i,j+1);
        find(grid ,i , j-1);
    }
    public int closedIsland(int[][] grid) {
         int count=0;
        for(int i =1 ;i<grid.length-1;i++)
        {
            for(int j=1;j<grid[0].length-1 ;j++)
            {
                if(grid[i][j]==0)
                {
                 find(grid , i,j );
                 if(t==false)
                 {
                 count++;
                 }
                }
                t=false;                    
            }
        }
        return count;
    }
}