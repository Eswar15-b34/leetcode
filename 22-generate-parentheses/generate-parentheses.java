class Solution {
    void fun(int ob , int cb , List<String> al ,String s )
    {
        if(ob==0 && cb==0 )
        {
            al.add(s);
            return;
        }
        if(ob>0)
        {
            fun(ob-1,cb,al,s+"(");
        }
        if(cb>ob)
        {
            fun(ob,cb-1,al,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        String s="";
        fun(n,n,al,s);
        return al;
    }
}