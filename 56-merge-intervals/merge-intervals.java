class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mat= new ArrayList();
        mat.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int [] last = mat.get(mat.size()-1);
            int [] current = intervals[i];
            if(last[1]>=current[0])
            {
                last[1]=Math.max(last[1],current[1]);
            }
            else 
            {
                mat.add(intervals[i]);
            }
            
        }
        return mat.toArray(new int[0][]);
    }
}