class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int m = k;
        int mx = Integer.MIN_VALUE;
        int i = 0;

        while (i < nums.length) {
            int count = 0;
            m = k;
            l = i;

            while (i < nums.length && m >= 0) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    if (m == 0) {
                        break;
                    }
                    m--;
                    count++;
                }
                i++;
            }

            mx = Math.max(mx, count);

            i = l + 1;
        }

        return mx;
    }
}