class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for(int i : prices)
        {
            System.out.print(i + " ");
        }
        for(int j : discounts)
        {
            System.out.print(j + " ");
        }
        int n = prices.length-1;
        int m = discounts.length-1;
        double a = 0;
        while(n>=0)
        {
            if(m>=0)
            {
              a = a +(double) prices[n]*(100-discounts[m])/100;
              m--;
            }
            else
            {
             a=a+prices[n];
            }
            n--;
            
        }
        return a;
    }
}