class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        if(nums[0] > target){
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (right+left)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        } 

        if(nums[mid] < target){
            return mid+1;
        }
        return mid;
    }
}