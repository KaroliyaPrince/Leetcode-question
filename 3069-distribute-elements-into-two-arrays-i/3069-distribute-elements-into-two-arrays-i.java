class Solution {
    public int[] resultArray(int[] nums) {
         
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int idx1 = 0;
        int idx2 = 0;

        for(int i=2 ; i<n ; i++){
            if(arr1[idx1] > arr2[idx2]){
                idx1++;
                arr1[idx1] = nums[i];
            }
            else{
                idx2++;
                arr2[idx2] = nums[i];
            }
        }

        int j=0;
        for(int i=idx1+1 ; i<n ; i++){
            arr1[i] = arr2[j];
            j++; 
        }

        return arr1;
    }
}