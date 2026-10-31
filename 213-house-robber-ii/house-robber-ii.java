class Solution {
    int fun( int nums[] ,int idx, int n , int memo[] )
    {
        if(idx>=n) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int c = nums[idx]+fun(nums, idx+2,n,memo);
        int k = fun(nums,idx+1,n,memo);
        memo[idx] = Math.max(c,k);
        return memo[idx];
    }
    public int rob(int[] nums) {
        if(nums.length ==1 ) return nums[0];
        int memo[] = new int[nums.length];
        int memo2[]= new int[nums.length+1];
        Arrays.fill(memo,-1);
        Arrays.fill(memo2,-1);
         return Math.max(fun(nums,0,nums.length-1,memo), fun(nums,1,nums.length,memo2));
    }
}