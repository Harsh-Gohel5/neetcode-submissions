class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0; 
        int vote = 0;

        for(int i = 0; i < n; i++) {
            if(count == 0){
                vote = nums[i];
            }

            if(nums[i] == vote) {
                count++;
            }
            else {
                count--;
            }
        }
        return vote;
    }
}