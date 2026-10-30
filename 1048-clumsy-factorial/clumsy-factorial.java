class Solution {
    public int clumsy(int n) {
    Stack<Integer> st = new Stack<>();
    st.push(n);
    int c=0;
    for(int i=n-1;i>0;i--)
    {
      if(c%4==0)
      {
        st.push(st.pop()*i);

      }
      else if(c%4==1)
      {
        st.push(st.pop()/i);
      }
      else if(c%4==2)
      {
           st.push(i);
           
      }
      else 
      {
        st.push(-i);
      }
      c++;
    }
    double sum =0;
    while(!st.isEmpty())
    {
        sum=sum+st.pop();
    }
    return (int)sum;
    }
}