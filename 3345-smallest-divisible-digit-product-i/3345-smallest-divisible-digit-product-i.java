class Solution {
    public int smallestNumber(int n, int t) {
        
        int temp = 0;
        int prod = 1;
        while(true){
            temp = n;
            prod = 1;

            while(temp!=0){
                prod *= temp%10;
                temp/=10;
            }

            if(prod % t == 0){
                return n;
            }

            n++;
        }
    }
}