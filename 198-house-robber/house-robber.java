import java.util.*;
class Solution {
    int find(int [] nums,int idx, int memo[]  )
    {
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int c= nums[idx]+find(nums,idx+2,memo);
        int k =  find(nums,idx+1,memo);
        memo[idx]= Math.max(c,k);
        return memo[idx];
    }
    public int rob(int[] nums) {
        int memo[] = new int[nums.length+1];
        Arrays.fill(memo,-1);
        return Math.max(find(nums,0,memo),find(nums,1,memo));
        
    }
}