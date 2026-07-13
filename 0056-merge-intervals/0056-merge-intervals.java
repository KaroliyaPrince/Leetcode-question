class Solution {
    public int[][] merge(int[][] intervals) {
        
        int ans[][] = new int[intervals.length][2];
        int idx = 0;


        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];

        for(int i=1;i<intervals.length;i++){

            if(ans[idx][1] >= intervals[i][0]){
                ans[idx][1] = Math.max(intervals[i][1] , ans[idx][1]);
            }
            else{
                idx++;
                ans[idx][0] = intervals[i][0];
                ans[idx][1] = intervals[i][1];
            }
        }

        int finalAns[][] = new int[idx+1][2];

        for(int i=0;i<=idx;i++){
            finalAns[i][0] = ans[i][0];
            finalAns[i][1] = ans[i][1];
        }

        return finalAns;
    }
}