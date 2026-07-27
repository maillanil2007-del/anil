class Solution {
    public int firstUniqChar(String s) {
        // Array to store the frequency of each lowercase English letter
        int[] charCounts = new int[26];
        int n = s.length();
        
        // First pass: Count the occurrences of each character in the string
        for (int i = 0; i < n; i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        
        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < n; i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first unique character
            }
        }
        
        // If no unique character exists, return -1
        return -1;
    }
}
