class Solution {
    public String toLowerCase(String s) {
        // Convert the string to a character array to modify it
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is an uppercase letter
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Add 32 to the ASCII value to get the lowercase equivalent
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        // Convert the character array back to a string
        return new String(chars);
    }
}
