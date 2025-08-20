class Solution {
    public int pivotIndex(int[] nums) {
        int[] rightarr = new int[nums.length];
        int[] leftarr = new int[nums.length];
        int sum = 0;
        for(int i = nums.length-1 ; i>=0 ; i--){
            sum += nums[i];
            rightarr[i] = sum;
        }
        sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
            if(sum == rightarr[i]){
                return i;
            }
        }
        return -1;
    }
}