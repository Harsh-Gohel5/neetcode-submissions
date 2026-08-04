class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int frequency = 0;

       for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(nums[i] == nums[j]){
                frequency++;
                }
            }
            if(frequency > n /2) {
                return nums[i];
            }
        }
        return -1; 
    }
}