class Solution {
    public int climbStairs(int n) {
        return numberOfWay(n,1,2);
    }

    int numberOfWay(int n,int a,int b){
        if(n==1){
            return a;
        }

        return numberOfWay(n-1,b,a+b);
    }
}