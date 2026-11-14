class Solution {
    int c =0;
    void fun(int [] nums , int idx , int t , int s )
    {
        if(idx>=nums.length)
        {
            if(s==t)
            {
            c++;
            }
            return;
        }
        fun(nums,idx+1,t,s+nums[idx]);
        fun(nums,idx+1,t,s-nums[idx]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        fun(nums,0,target,0);
        return c;
    }
}