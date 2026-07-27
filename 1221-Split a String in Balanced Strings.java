class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Increment for 'L', decrement for 'R'
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }
            
            // Whenever balance reaches 0, we found a balanced substring
            if (balance == 0) {
                count++;
            }
        }
        
        return count;
    }
}
