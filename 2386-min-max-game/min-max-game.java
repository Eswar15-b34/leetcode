class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int c=1;
        int [] arr = new int[nums.length/2];
        int k=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            int j=i+1;
            if(c%2==0)
            {
               arr[k++]=Math.max(nums[i],nums[j]);
            }
            else
            {
                arr[k++]=Math.min(nums[i],nums[j]);
            }
            c++;
        }
        return minMaxGame(arr);

       
    }
}