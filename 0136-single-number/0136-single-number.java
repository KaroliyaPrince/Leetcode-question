class Solution {
    public int singleNumber(int[] nums) {
        
        boolean flag = true;

        for(int i=0 ; i<nums.length ; i++){
            flag = true;
            for(int j=0 ; j<nums.length;j++){
                if(nums[i] == nums[j] && i!=j){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return nums[i];
            }
        }
        return 0;
    }
}