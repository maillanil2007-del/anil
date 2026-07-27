class Solution {
    public String replaceDigits(String s) {
        // Convert string to char array since strings are immutable in Java
        char[] chars = s.toCharArray();
        
        // Iterate only through the odd indices, where the digits are located
        for (int i = 1; i < chars.length; i += 2) {
            // chars[i] - '0' converts the digit character into its integer value.
            // We add this integer to the preceding character to shift it forward.
            chars[i] = (char) (chars[i - 1] + chars[i] - '0');
        }
        
        // Convert the modified character array back to a String
        return new String(chars);
    }
}
