class Solution {
       List<List<Integer>> ans =new ArrayList<>();
    void fun(int[] nums , int idx, List l,int k)
    {
        int sum=0;
             for(int n=0;n < l.size();n++)
            {
                sum += (int)l.get(n);
            }
            if(sum==k)
            {
            ans.add(new ArrayList<>(l));
            }
            if(sum>k) return ;
        for(int i=idx ; i<nums.length ;i++)
        {
        l.add(nums[i]);
        fun(nums,i+1,l,k);
        l.remove(l.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates , 0, l,target);
        return ans;
    }
}