class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        
        // Since the constraint says 1 <= nums[i] <= 100, 
        // we can use a fixed-size array to count occurrences.
        int[] count = new int[101];
        
        for (int num : nums) {
            // If we've seen this number 'count[num]' times before,
            // it can form 'count[num]' new pairs with the current number.
            goodPairs += count[num];
            
            // Increment the count for this number for future iterations
            count[num]++;
        }
        
        return goodPairs;
    }
}
