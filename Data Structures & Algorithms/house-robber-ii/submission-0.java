class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         
        if(n == 1) {
            return nums[0];
        }
        
        int case1 = loot(nums, 0, n - 2);
        int case2 = loot(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int loot(int[] nums, int start, int end) {
        int p2 = 0;
        int p1 = 0;

        for(int i = start; i <= end; i++) {
            int take = nums[i] + p2;
            int notTake = p1;

            int cur = Math.max(take, notTake);

            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}
