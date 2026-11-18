class Solution {
    int count=0 ;
    void fun(int [][] arr , Queue<Integer> q1 , Queue<Integer> q2 )
    {
      while(!q1.isEmpty())
      {
        int n = q1.size();
        boolean f = true;
        for( int m=0 ;m<n;m++)
        {
        int l = q1.remove();
        int k = q2.remove();
        if(l+1<arr.length && arr[l+1][k]==1 )
        {
        arr[l+1][k]=2;
        q1.add(l+1);
        q2.add(k);
        f=false;
        }
        if(l-1>=0 && arr[l-1][k]==1)
        {
            arr[l-1][k]=2;
            q1.add(l-1);
            q2.add(k);
            f= false;
        }
        if(k-1>=0 && arr[l][k-1]==1)
        {
            arr[l][k-1]=2;
            q1.add(l);
            q2.add(k-1);
            f=false;
        }
        if(k+1<arr[0].length && arr[l][k+1]==1)
        {
            arr[l][k+1]=2;
            q1.add(l);
            q2.add(k+1);
            f=false;
        }
        }
        if(f==false)
        count++;
      }
    }
    public int orangesRotting(int[][] arr) {
      Queue<Integer> q1 = new LinkedList<>();
      Queue<Integer> q2 = new LinkedList<>();
      int f=0;
      for(int i=0 ;i<arr.length ;i++)
      {
        for(int j=0 ;j<arr[0].length ;j++)
        {
            if(arr[i][j]==2)
            {
                q1.add(i);
                q2.add(j); 
            }
        }
      }
      fun(arr,q1,q2);
       for(int i=0 ;i<arr.length ;i++)
      {
        for(int j=0 ;j<arr[0].length ;j++)
        {
            if(arr[i][j]==1)
            {
               return -1;
            }
        }
      }
      return count;
    }
}