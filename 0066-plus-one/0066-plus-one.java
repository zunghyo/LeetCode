class Solution {
    public int[] plusOne(int[] digits) {
        int digitLength = digits.length;
        
        for(int i = digitLength -1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] result = new int[digitLength +1];
        result[0] = 1;
        
        return result;
    }
}