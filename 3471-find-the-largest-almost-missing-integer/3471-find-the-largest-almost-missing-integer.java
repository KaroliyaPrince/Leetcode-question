class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int n = nums.length;

        if(k == 1) return getLargest(nums);

        if(k == n){
            Arrays.sort(nums);
            return nums[n-1];
        }

        int first_element = nums[0];
        int last_element = nums[n-1];
        int count_1 = 0,count_2 = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(first_element == nums[i]) count_1++;
            if(last_element == nums[i]) count_2++;
        }

        if(count_1 == 1 && count_2==1){
            return Math.max(first_element,last_element);
        }

        if(count_1 > 1 && count_2 > 1) return -1;

        if(count_1 < count_2){
            return nums[0];
        }

        if(count_1 > count_2){
            return nums[n-1];
        }
        return -1;
    }

    public static int getLargest(int[] nums){
        Arrays.sort(nums);
        int flag = 0;
        for(int i=nums.length-1 ; i>=0 ; i--){
            flag = 0;
            for(int j = 0 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    flag++;
                }
            }

            if(flag == 1){
                return nums[i];
            }
        }

        return -1;
    }
}