class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int L_count = 0;
        int R_count = 0;
        int _count = 0;

        for(int i=0 ; i<moves.length() ; i++){
            char c = moves.charAt(i);

            if(c == 'L') L_count++;
            else if(c == 'R') R_count++;
            else _count++;
        }

        return Math.abs(L_count-R_count) + _count;
    }
}