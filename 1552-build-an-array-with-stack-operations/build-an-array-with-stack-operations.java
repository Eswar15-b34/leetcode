class Solution {
    public List<String> buildArray(int[] target, int n) {
        int arr []= new int[n];
        List<String> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int j=0;
        int k=0;
        while(k!=target.length)
        {
            if(arr[j]==target[k])
            {
              st.add("Push");
              k++;
              j++;
            }
            else  if(arr[j]!=target[k])
            {
                st.add("Push");
                st.add("Pop");
                j++;
            }
        }
        return st;

    }
}