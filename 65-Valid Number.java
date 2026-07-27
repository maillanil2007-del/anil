class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenExponent = false;
        boolean seenDot = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                // If it's a number 0-9, we've seen a digit
                seenDigit = true;
                
            } else if (c == '+' || c == '-') {
                // A sign is only valid if it's the very first character, 
                // OR immediately following an 'e' or 'E'.
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                
            } else if (c == 'e' || c == 'E') {
                // An exponent is only valid if we haven't seen one already, 
                // AND we have already seen a digit.
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                // We reset seenDigit to false because we MUST have a new integer after the exponent
                seenDigit = false;
                
            } else if (c == '.') {
                // A dot is only valid if we haven't seen one already, 
                // AND we haven't seen an exponent yet (exponents only take integer powers).
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
                
            } else {
                // If we encounter any character other than digits, signs, 'e/E', or '.', it's invalid.
                return false;
            }
        }
        
        // At the end, the string is only a valid number if it actually contains a digit.
        // Also, if we saw an 'e', resetting seenDigit ensures we actually had numbers after it.
        return seenDigit;
    }
}
