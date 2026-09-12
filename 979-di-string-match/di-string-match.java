class Solution {
    public int[] diStringMatch(String s) {
        int [] arr = new int[s.length()+1];
        int i =0;
        int j =s.length();
        int k=0;
        for(k =0;k<s.length();k++)
        {
            if(s.charAt(k)=='I')
            {
                arr[k]=i;
                i++;
            }
            else
            {
                arr[k]=j;
                j--;
            }
        }
        arr[k]=i;
        return arr;
    }
}