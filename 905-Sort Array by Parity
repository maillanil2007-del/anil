class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // If left points to an odd number and right points to an even number, swap them
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            // Advance left if it's already even
            if (nums[left] % 2 == 0) {
                left++;
            }
            
            // Decrease right if it's already odd
            if (nums[right] % 2 != 0) {
                right--;
            }
        }
        
        return nums;
    }
}
