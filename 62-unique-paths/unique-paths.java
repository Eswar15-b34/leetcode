class Solution {
    int unique(int m , int n , int k , int l, int memo[][])
    {
        if(k==m-1 && l==n-1)  return 1;
        if(k>=m ||  l>=n) return 0;
        if(memo[k][l]!=-1) return memo[k][l];
        memo[k][l] = unique(m,n,k,l+1,memo)
        + unique(m,n,k+1,l,memo);
        return memo[k][l];
    }
    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m+1][n+1];
        for(int i =0 ;i<memo.length;i++)
        {
            Arrays.fill(memo[i],-1);
        }
        return unique(m,n,0,0,memo);
    }
}