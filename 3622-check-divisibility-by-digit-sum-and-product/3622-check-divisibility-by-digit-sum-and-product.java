class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long mul = 1;
        long temp = n;

        while(n!=0){
            sum += n%10;
            mul *= n%10;

            n/=10;
        }

        sum += mul;

        if(temp % sum == 0){
            return true;
        }

        return false;
    }
}