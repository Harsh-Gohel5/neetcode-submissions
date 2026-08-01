class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> r = new HashSet <>();

        for(int i = 0; i < nums.length; i++) {
            if(r.contains(nums[i])){
                return true;
            }
        r.add(nums[i]);
        }
        return false;
    }
}