class Solution {
    public boolean validateStackSequences(int[] p, int[] o) {
        Stack<Integer> s = new Stack<>();
        int i =0;
        for(int j=0;j<p.length;j++)
        {
          s.push(p[j]);
          while( s.size()>0 && s.peek()==o[i])
          {
            s.pop();
            i++;
          }
        }
        return s.size()==0;
    }
}