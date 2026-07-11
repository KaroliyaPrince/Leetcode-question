class Solution {

    int sum = 0;

    public int maxSubArray(int[] nums) {

        int curSum = 0;
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            max = Math.max(curSum,max);

            if(curSum < 0){
                curSum = 0;
            }
        }

        return max;
    }
}