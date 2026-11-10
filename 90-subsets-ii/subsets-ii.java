class Solution {
    List<List<Integer>>  ans =  new ArrayList<>();
    void fun(int [] nums , int idx , List al)
    {
        if(idx>=nums.length)
        {
           
            ans.add(new ArrayList<>(al));
            return ;
        }
        al.add(nums[idx]);
        fun(nums,idx+1,al);
        al.remove(al.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;
        fun(nums,idx+1,al);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>();
        fun(nums,0,al);
        return ans;
    }
}