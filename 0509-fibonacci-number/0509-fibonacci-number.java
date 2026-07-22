class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return getAns(n,0,1);
    }

    int getAns(int n,int E1 , int E2){
        if(n == 0){
            return E1;
        }

        return getAns(n-1,E2,E1+E2);
    }
}