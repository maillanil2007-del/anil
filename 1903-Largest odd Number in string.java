class Solution {
    public String largestOddNumber(String num) {
        // Iterate from the end of the string backwards
        for (int i = num.length() - 1; i >= 0; i--) {
            // Get the numeric value of the character
            int digit = num.charAt(i) - '0';
            
            // Check if the digit is odd
            if (digit % 2 != 0) {
                // Return the substring from the start to this odd digit (inclusive)
                return num.substring(0, i + 1);
            }
        }
        
        // If we check every digit and none are odd, return an empty string
        return "";
    }
}
