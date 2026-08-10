class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
    
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int temp = 0;
        int left = 0;
        int right = 0;

        for(int i=0 ; i<nums.length - 2 ; i++){
            
            left = i+1;
            right = nums.length - 1;

            while(left < right){
                temp = nums[i] + nums[left] + nums[right];

                if(temp == target){
                    return temp;
                }

                if(Math.abs(target - ans) > Math.abs(target - temp)){
                    ans = temp;
                }

                if(temp < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return ans;
    }
}