class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i=0 ; i<nums.length ; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=min ; i<=max ;i++){
            boolean flag = true;
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j] == i){
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans.add(i);
            }
        }

        return ans;
    }

}