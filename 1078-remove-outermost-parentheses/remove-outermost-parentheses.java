class Solution {
    public String removeOuterParentheses(String s) {
       
        // Create a StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // This variable keeps track of the current depth of nested parentheses
        int depth = 0;

        // Loop through each character in the input string
        for (char ch : s.toCharArray()) {

            // If the character is an opening bracket '('
            if (ch == '(') {
                // If depth is greater than 0, it's not the outermost bracket
                // So we add it to the result
                if (depth > 0) {
                    result.append(ch);
                }
                // Increase depth because we encountered an opening bracket
                depth++;
            } else {
                // If the character is a closing bracket ')'
                // Decrease depth first because we're closing a bracket
                depth--;

                // If depth is still greater than 0, it's not the outermost ')'
                // So we add it to the result
                if (depth > 0) {
                    result.append(ch);
                }
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
}


    
    
