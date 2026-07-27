class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element to handle arrays with all negative numbers
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current number to the existing subarray
            // or start a new subarray from the current number.
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the maximum sum encountered so far.
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
