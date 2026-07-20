class Solution {
    public int removeDuplicates(int[] nums) {
        
        int unique[] = new int[nums.length];
        int k = 0;
        boolean isExist = false;
        unique[0] = nums[0];

        for(int i=1 ; i<nums.length ; i++){
            isExist = false;
            for(int j=0 ; j<=k ; j++){
                if(nums[i] == unique[j]){
                    isExist = true;
                    break;
                }
            }

            if(!isExist){
                unique[++k] = nums[i];
            }
        }

        for(int i=0 ; i<=k ; i++){
            nums[i] = unique[i];
        }
        return k+1;
    }
}