class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;
        int tempArr[] = new int[m*n];
        int idx = 0;
        int x = 0;
        int j=0;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i=0 ; i<m ; i++){
            for(j=0 ; j<n ; j++){
                tempArr[idx++] = grid[i][j];
            }
        }

        for(int i=0 ; i<k ; i++){
            x = tempArr[m*n - 1];
            for(j=m*n - 1 ; j>0 ; j--){
                tempArr[j] = tempArr[j-1];
            }

            tempArr[j] = x;
        }

        idx = 0;

        for(int i=0 ; i<m ; i++){
            List<Integer> tempList = new ArrayList<Integer>();

            for(j=0 ; j<n ; j++){
                tempList.add(tempArr[idx++]);
            }

            ans.add(tempList);
        }

        return ans;
    }
}