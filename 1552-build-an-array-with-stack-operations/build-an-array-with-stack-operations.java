class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> st = new Stack<>();
        int j=1;
        int k=0;
        while(k!=target.length)
        {
            if(j==target[k])
            {
              st.add("Push");
              k++;
              j++;
            }
            else  if(j!=target[k])
            {
                st.add("Push");
                st.add("Pop");
                j++;
            }
        }
        return st;

    }
}