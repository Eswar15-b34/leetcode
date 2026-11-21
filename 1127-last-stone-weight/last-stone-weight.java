class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length ==1)
        {
        return stones[0];
        }
        Arrays.sort(stones);
        int i=stones.length-1;
        int j=stones.length-2;
        while(stones[j]!=0)
        {
           if(stones[i]==stones[j])
           {
            stones[i]=0;
             stones[j]=0;
           }
           else if(stones[i]!=stones[j])
           {
            stones[i]-=stones[j];
            stones[j]=0;
            
           }
           Arrays.sort(stones);
        }
        if(stones[i]==0)
        return 0;
        return stones[i];
    }
}