class Solution {
    public String compressedString(String word) {
        String s="";
        int c=1;
        for(int i=1;i<=word.length();i++)
        {
            if(i<word.length()&& word.charAt(i)==word.charAt(i-1) && c<9)
            {
                c++;
            }
            else
            {
                s+=String.valueOf(c)+String.valueOf(word.charAt(i-1));
                c=1;
            }
            
        }
        return s;
    }
}