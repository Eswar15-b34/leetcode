class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    void fun(int[] arr , int idx, List l,int k,int s)
    {
        if(l.size()==k)
        {
            int sum=0;
            for(int n=0;n<l.size();n++)
            {
                sum=sum+(int)l.get(n);
            }
            if(sum==s)
            {
            ans.add(new ArrayList<>(l));
            }
        }
            for(int i = idx ;i<arr.length ;i++)
            {
                l.add(arr[i]);
                fun(arr,i+1,l,k,s);
                l.remove(l.size()-1);
            }
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] arr = new int[9];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<9;i++)
        {
            arr[i]=i+1;
        }
        fun(arr,0,l,k,n);
        return ans;
    }
}