class Solution {
    public boolean isValid(String s) {
        int n =-1;
        int p =s.length();
        while(p!=n)
        {
            p=s.length();
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
            n=s.length();
        }
        if(s.length()==0)
        {
            return true;
        }
        return false;
    }
}