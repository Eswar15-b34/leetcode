class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(int[] c , int idx , int t, ArrayList<Integer> al)
    {
        if(t==0)
        {
             ans.add(new ArrayList<>(al));
             return ;
        }
        if(t<0) return ;
        if(idx>=c.length) return ;
        al.add(c[idx]);
        fun(c,idx,t-c[idx],al);
        al.remove(al.size()-1);
        fun(c,idx+1,t,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fun(candidates, 0, target , new ArrayList<>());
        return ans;
    }
}