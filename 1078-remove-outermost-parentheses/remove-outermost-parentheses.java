class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int oc=0;
        int fc =0;
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='(')
            {
              oc++;
            }
            else if(s.charAt(j)==')')
               {
                fc++;
            if(oc==fc)
            {
                ans+=s.substring(i+1,j);
                i=j+1;
                
            }
               }
    }
    return ans;
    }
}