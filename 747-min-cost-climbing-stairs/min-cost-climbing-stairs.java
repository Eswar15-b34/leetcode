import java.util.*;
class Solution {
    int fun(int arr[], int idx, int memo[])
{
    if(idx>= arr.length) return 0;
    if(memo[idx]!=-1) return memo[idx];
    memo[idx] = arr[idx]+Math.min(fun(arr,idx+1,memo),fun(arr,idx+2,memo));
    return memo[idx];
}

    public int minCostClimbingStairs(int[] arr) {
        int memo[]= new int[arr.length+1];
        Arrays.fill(memo,-1);
        return Math.min(fun(arr,0,memo),fun(arr,1,memo));
    }
}