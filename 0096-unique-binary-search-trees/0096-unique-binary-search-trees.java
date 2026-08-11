class Solution {
    public int numTrees(int n) {
        long combination = 1;

        for(int i = 1 ; i<=n ; i++){
            combination = combination * (n+i)/i;
        }


        return (int)(combination / (n+1));
    }
}