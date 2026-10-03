class Solution {
    public int[] dailyTemperatures(int[] t) {
        int [] arr = new int[t.length];
        Stack<Integer> st = new Stack<>();
        for(int i=t.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && t[i]>=t[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr[i]= 0;
            }
            else if(t[i]<t[st.peek()])
            {
              arr[i]=st.peek()-i;
            }
            st.push(i);
            System.out.println(st.peek());
        }
        return arr;
    }
}