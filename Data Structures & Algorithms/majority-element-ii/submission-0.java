class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        int count1 = 0;
        Integer maj1 = null; 

        int count2 = 0;
        Integer maj2 = null; 

        // Step 1: Find candidates
        for(int i = 0; i < n; i++) {
            if(maj1 != null && nums[i] == maj1) {
                count1++;
            }
            else if(maj2 != null && nums[i] == maj2) {
                count2++;
            }
            else if(count1 == 0) {
                maj1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0) {
                maj2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        List<Integer> result = new ArrayList<>(); // Proper initialization
        int freq1 = 0;
        int freq2 = 0;

        for(int num : nums) {
            // Check against null before comparing values
            if(maj1 != null && num == maj1) {
                freq1++;
            }
            else if(maj2 != null && num == maj2) {
                freq2++;
            }
        }
        
        // Integer division automatically handles the floor logic
        if(freq1 > n / 3) {
            result.add(maj1); // Changed to add()
        }
        if(freq2 > n / 3) {
            result.add(maj2); // Changed to add()
        }
        
        return result;
    }
}