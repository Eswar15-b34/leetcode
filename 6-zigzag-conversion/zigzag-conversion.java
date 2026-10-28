class Solution {
    public String convert(String s, int n) {
        char arr[][]= new char[n][s.length()];
        if(n==1) return s;
        String st ="";
        int k = 0;
        int j=0;
        int i=0;
        while(k<s.length())
        {
          while(i!=n)
          {
            if(k==s.length()){ break;}
            arr[i][j]=s.charAt(k++);
            i++;

          }
          i=i-2;
          j++;
          while(i>=0)
          {
            if(k==s.length()){ break;}
            arr[i][j]=s.charAt(k++);
            i--;
            j++;
          }
          i=i+2;
          j--;
        }
        for(int l=0;l<n;l++)
        {
            for(int m=0;m<arr[l].length;m++)
            {

                
                if(Character.isLetter(arr[l][m]) || arr[l][m]==',' || arr[l][m]== '.')
                {
                st=st+arr[l][m];
                }
            }
        }
        return st;
} 
}