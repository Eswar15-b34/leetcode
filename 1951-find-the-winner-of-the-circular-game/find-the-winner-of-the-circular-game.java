class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
         for(int i =1;i<=n;i++)
           {
            al.add(i);
           }
        int l=0;
           while(al.size()>1 )
           {
            l=(l+k-1)%al.size();
            al.remove(l);
            
           }
    return al.get(0);
}
}