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
               
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}