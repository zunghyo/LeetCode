import java.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder cleaned = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(Character.isLetter(currentChar) || Character.isDigit(currentChar)) {
                cleaned.append(Character.toLowerCase(currentChar));
            }
        }
               
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();
        
        return cleanedStr.equals(reversedStr);
    }
}