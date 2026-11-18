class Solution {
    int max=0 ;
     void  find(int[][] grid , int i , int j ,int sum )
    {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length) return  ;
         if(grid[i][j]==0) return  ;
         sum+=grid[i][j];
         max=Math.max(max,sum);
        int temp = grid[i][j];
        grid[i][j]=0;
        find(grid, i+1 ,j,sum);
        find(grid, i-1,j,sum);
        find(grid, i,j+1,sum);
        find(grid ,i , j-1,sum);
        grid[i][j]=temp;
    }
    public int getMaximumGold(int[][] grid) {
        for(int i =0 ;i<grid.length ;i++)
        {
            for(int j=0 ;j<grid[0].length;j++)
            {
             if(grid[i][j]!=0)
             {
                find(grid, i,j ,0 );
             }
            }
        }
        return  max;
    }
}