class Solution {
    public int[] finalPrices(int[] p) {
        int [] arr = new int[p.length];
        Stack<Integer> st = new Stack<>();
        for(int i=p.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && p[i]<st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr[i]=p[i];
            }
            else if(p[i]>=st.peek())
            {
              arr[i]= p[i]-st.peek();
            }
            st.push(p[i]);
        }
        return arr;
            }
}