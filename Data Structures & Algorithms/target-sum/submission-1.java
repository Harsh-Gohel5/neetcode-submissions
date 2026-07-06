class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (Math.abs(target) > totalSum) {
            return 0;
        }

        if ((totalSum + target) % 2 != 0) {
            return 0;
        }

        int sum = (totalSum + target) / 2;

        return countSubsets(nums, sum);
    }

    public int countSubsets(int[] nums, int sum) {
        int n = nums.length;

        int[][] t = new int[n + 1][sum + 1];

        t[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                int notTake = t[i - 1][j];

                int take = 0;
                if (nums[i - 1] <= j) {
                    take = t[i - 1][j - nums[i - 1]];
                }

                t[i][j] = take + notTake;
            }
        }

        return t[n][sum];
    }
}