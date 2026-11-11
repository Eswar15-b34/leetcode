class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    void fun(int[] arr , int idx, List l,int k)
    {
        if(l.size()==k)
        {
            ans.add(new ArrayList<>(l));
        }
            for(int i = idx ;i<arr.length ;i++)
            {
                l.add(arr[i]);
                fun(arr,i+1,l,k);
                l.remove(l.size()-1);
            }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        List<Integer> al = new ArrayList<>();
        fun(arr,0,al,k);
        return ans;
    }
}