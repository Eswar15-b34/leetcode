class Solution {
     void find(int [][] grid , int i , int j,int x ,int c )
    {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length) return ;
        if( grid[i][j]!=x ) return ;
        if(grid[i][j]== c) return ;
        grid[i][j]=c;
        find(grid, i+1 ,j,x,c);
        find(grid, i-1,j,x,c);
        find(grid, i,j+1,x,c);
        find(grid ,i , j-1,x,c);
    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int c) {
            int x = grid[sr][sc];
            find(grid,sr,sc,x,c );             
            return grid;
    }
}