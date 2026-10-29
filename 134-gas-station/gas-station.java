class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s = 0, t = 0, tl = 0;
        for (int i = 0; i < gas.length; i++)
         {
            int diff = gas[i] - cost[i];
            t += diff;
            tl += diff;
            if (t < 0) 
            {
                s = i + 1;
                t = 0;
            }
        }
        if(tl>=0)
        {
            return s;
        }
        else
        {
            return -1;
        }
    }
}