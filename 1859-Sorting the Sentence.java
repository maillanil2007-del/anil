class Solution {
    public String sortSentence(String s) {
        // Split the shuffled sentence into an array of words
        String[] words = s.split(" ");
        // Create an array to hold the words in their correct order
        String[] ans = new String[words.length];
        
        for (String word : words) {
            int n = word.length();
            // The last character is the 1-indexed position.
            // Subtract '0' to get the integer value, and subtract 1 for 0-based indexing.
            int index = word.charAt(n - 1) - '0' - 1;
            
            // Extract the actual word without the number and place it at the correct index
            ans[index] = word.substring(0, n - 1);
        }
        
        // Join the correctly ordered words with a single space
        return String.join(" ", ans);
    }
}
