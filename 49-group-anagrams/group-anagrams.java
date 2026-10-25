
class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
       List<List<String>> l = new ArrayList<>();
       HashMap<String,ArrayList<String>> hm = new HashMap<>();
       for(int i =0 ;i<s.length;i++)
       {
       char[] arr = s[i].toCharArray();
       Arrays.sort(arr);
       String ss = new String(arr);
       hm.putIfAbsent(ss, new ArrayList<String>());
       hm.get(ss).add(s[i]);
       }
       l.addAll(hm.values());
       return l;
}
}