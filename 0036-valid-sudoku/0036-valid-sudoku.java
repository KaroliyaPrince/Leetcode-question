class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> forRow = new HashMap<Character,Integer>();
        HashMap<Character,Integer> forCol = new HashMap<Character,Integer>();
        
        int n = board.length;
        boolean isDublicate = false;

        for(int i=0 ; i<n ; i++){
            isDublicate = false;
            for(int j=0 ; j<n ; j++){
                
                char rowKey = board[i][j];
                char colKey = board[j][i];
                int rowVal = forRow.getOrDefault(rowKey , 0);
                int colVal = forCol.getOrDefault(colKey , 0);

                if(rowKey != '.' && rowVal != 0) isDublicate = true;
                if(colKey != '.' && colVal != 0) isDublicate = true;

                forRow.put(rowKey , rowVal+1);
                forCol.put(colKey , colVal+1);
                
            }

            if(isDublicate) return false;

            forRow.clear();
            forCol.clear();
        }

        for(int i=0 ; i<n ; i=i+3){
            for(int j=0 ; j<n ; j=j+3){
                isDublicate = checkBlock(i , j , board);

                if(isDublicate) return false;
            }
        }

        return true;

    }

    boolean checkBlock(int i , int j , char[][] board){
        HashMap<Character,Integer> forBlock = new HashMap<Character,Integer>();

        for(int x = i;x<i+3;x++){
            for(int y=j;y<j+3;y++){
                char key = board[x][y];
                int val = forBlock.getOrDefault(key , 0);

                if(key != '.' && val != 0){
                    return true;
                }

                forBlock.put(key, val + 1);
            }
        }

        return false;
    }
}