class Solution {
    public int maxDepth(String s) {
       int ma=0;
       int c=0;
       int n=0;
       for(int i=0;i<s.length();i++) 
       {
        if(s.charAt(i)=='(')
        {
            c++;
        }
        else if(s.charAt(i)==')')
        {
            ma=Math.max(c,ma);
            c--;
        }
       }
       return ma;
    }
}