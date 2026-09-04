class Solution {
    public boolean search(int[] nums, int target) {
       int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+((j-i)/2);
            if(nums[mid]==target){ return true;}
            if(nums[i]==nums[mid] && nums[j]==nums[mid])
            {
                i++;
                j--;
            }
            else if(nums[mid]>=nums[i]){
            if(nums[mid]>=target && nums[i]<=target)
            {
                j=mid;
            }
            else
            {
               i=mid+1;
            }
            }
            else if(nums[mid]<=nums[j])
            {if(nums[mid]<=target && nums[j]>=target)
            {
              i=mid;
            }
            else
            {
             j=mid-1;
            }
            }

        }
        return false;
    }
}