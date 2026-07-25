class Solution {
    public int maxProduct(int n) {
        
        int len = 0;

        int temp = n;

        while(temp != 0){
            len++;
            temp/=10;
        }

        int arr[] = new int[len];

        int i = len-1;

        while(n!=0){
            arr[i] = n%10;
            i--;
            n/=10;
        }
        int ans = 0;

        for(i=0 ; i<len-1 ; i++){
            for(int j = i+1 ; j<len ; j++){
                if(arr[i]*arr[j] > ans){
                    ans = arr[i]*arr[j];
                }
            }
        }

        return ans;
    }
}