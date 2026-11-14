class Solution {
    
    public int countSquares(int[][] matrix) {
        int s=0;
        for(int i=1 ;i<matrix.length ;i++)
        {
            for(int j=1 ;j<matrix[0].length ;j++)
            {
                if(matrix[i][j]==1)
                {
                    matrix[i][j]+= Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                }
            }
        }
        for(int i=0 ;i<matrix.length ;i++)
        {
            for(int j=0 ;j<matrix[0].length ;j++)
            {
               s=s+matrix[i][j];
            }
        }
        return s;
    }
}