class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // A ransom note cannot be constructed if it is longer than the magazine
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        // Array to store the frequency of each lowercase English letter
        int[] charCounts = new int[26];
        
        // Count the occurrences of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // Check if the ransom note can be formed
        for (char c : ransomNote.toCharArray()) {
            // If the character count drops below zero, we don't have enough letters
            if (charCounts[c - 'a'] == 0) {
                return false;
            }
            charCounts[c - 'a']--;
        }
        
        return true;
    }
}
