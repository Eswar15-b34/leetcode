class Solution {
    public boolean isLongPressedName(String name, String typed) {
       if(typed.length()<name.length()) {return false;}
       int i = 0;
       int j=0;
       while(i<name.length() && j<typed.length())
       {
        char c1=name.charAt(i);
        char c2 =typed.charAt(j);
        if(c1!=c2)return false;
        int count1=1;
        int count2 =1;
        while(i+1<name.length() && name.charAt(i)==name.charAt(i+1))
        {
            count1++; i++;
        }
        while(j+1<typed.length() && typed.charAt(j)==typed.charAt(j+1))
        {
            count2++; j++;
        }
        if(count1>count2)
        {
            return false;

        }
        i++;
        j++;
    }
    return i==name.length() && j==typed.length();
}
}