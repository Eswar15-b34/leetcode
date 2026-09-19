class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        String sp = "";
        for(int i =1;i<s.length();i++)
        {
            if(!st.empty())
            {
          if(s.charAt(i)!=(st.peek()) )
          {
            st.push(s.charAt(i));
          }
          else
          {
            st.pop();
          }
          }
          else
          {
          st.push(s.charAt(i));}

        }
        while(!st.isEmpty())
        {
            sp=st.pop()+sp;
        }
        return sp;
    }
}