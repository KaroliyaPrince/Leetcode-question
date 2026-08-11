class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        boolean isAns = true;


        for(int i=1 ; i<nums.length ; i++){
            
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }

        while(true){
            isAns = true;

            for(int i=0 ; i<nums.length ; i++){
                if(nums[i] == sum){
                    isAns = false;
                    break;
                }
            }

            if(isAns){
                return sum;
            }
            sum++;
        }

    }
}