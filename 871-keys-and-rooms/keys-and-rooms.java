class Solution {
    void dfs(List<List<Integer>> rooms , boolean vis [] , int start )
    {
        if(vis[start]) return ;
        vis[start]=true;
        for(int i : rooms.get(start))
        {
            dfs(rooms , vis , i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean vis [] = new boolean[rooms.size()];
       dfs(rooms , vis , 0);
       for(boolean i : vis)
       {
        if(i!=true)
       {
        return false;
       }
       }
       return true;
    }
}