class Solution {
    int area =0;
     void find(int [][] grid , int i , int j )
    {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length) return ;
        if(grid[i][j]==0) return ;
        area++;
        grid[i][j]=0;
        find(grid, i+1 ,j);
        find(grid, i-1,j);
        find(grid, i,j+1);
        find(grid ,i , j-1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int ans =0;
       for(int i =0 ;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length ;j++)
            {
                if(grid[i][j]==(1))
                {
                 find(grid , i,j );
                 ans = Math.max(ans,area);
                 area =0;
                }                    
            }
        }
        return ans;
    }
}