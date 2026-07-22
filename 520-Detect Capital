class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        int n = word.length();

        // Count the number of capital letters in the word
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        // Case 1: All letters are capitals (e.g., "USA")
        if (capitalCount == n) {
            return true;
        }

        // Case 2: All letters are lowercase (e.g., "leetcode")
        if (capitalCount == 0) {
            return true;
        }

        // Case 3: Only the first letter is capital (e.g., "Google")
        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        // Any other combination is invalid (e.g., "FlaG")
        return false;
    }
}
