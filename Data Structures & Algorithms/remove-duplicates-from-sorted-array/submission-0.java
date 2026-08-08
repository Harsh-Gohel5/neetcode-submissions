class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
       HashSet<Integer> set = new HashSet<>();

       for(int i = 0; i < n; i++) {
        if(set.add(nums[i])) {
            nums[count] = nums[i];
            count++;
            }
        } 
        return count;
    }
}