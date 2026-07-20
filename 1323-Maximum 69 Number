class Solution {
    public int maximum69Number (int num) {
        // Convert the integer to a character array
        char[] chars = String.valueOf(num).toCharArray();
        
        // Traverse to find the first '6' and change it to '9'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break; // Only change the first one to maximize the value
            }
        }
        
        // Convert the character array back to an integer
        return Integer.parseInt(new String(chars));
    }
}
