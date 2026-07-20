import java.util.*;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        // Iterate through all possible starting points
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            
            // Expand the substring and check characters
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                
                // If it's a consonant, we can't form a vowel substring anymore
                if (!isVowel(c)) {
                    break;
                }
                
                vowels.add(c);
                
                // If we have collected all 5 vowels, increment our count
                if (vowels.size() == 5) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
