class Solution {
    public boolean isValidSudoku(char[][] b) {
        String s = "123456789";
        for(int i =0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                int rc=0;
                int cc=0;
                if(s.contains(String.valueOf(b[i][j])))
                {
                    for(int n=i+1;n<b.length ;n++)
                    {
                        if(b[n][j]==b[i][j])
                        {
                            return false;
                        }
                    }
                    for(int n=j+1 ;n<b[i].length;n++)
                    {
                        if(b[i][n]==b[i][j])
                        {
                            return false;
                        }
                    }
                
                 rc=i-i%3;
                cc=j-j%3;
                for(int k = rc ;k<rc+3;k++)
                {
                    for(int l =cc ; l<cc+3;l++)
                    {
                        if(k==i && l==j)
                        {
                            continue;
                        }
                        if(b[k][l]==b[i][j])
                        {
                            return false;
                        }
                    }
                }
            }
        }
    }
    return true;
    }
}