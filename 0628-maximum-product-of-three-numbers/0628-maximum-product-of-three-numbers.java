class Solution {
    public int maximumProduct(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);

        int ans = nums[len-1] * nums[len - 2] * nums[len - 3];
        ans = Math.max(ans,nums[0] * nums[1] * nums[len - 1]);
        return ans;
    }
}