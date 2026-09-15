class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        int max = 0, ans = 0;
        for (int f : map.values())
            max = Math.max(max, f);
        for (int f : map.values())
            if (f == max) ans += f;
        return ans;
    }
}