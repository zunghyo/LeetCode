class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        
        if (n % 2 != 0) return false;

        int minOpen = 0, maxOpen = 0;
        
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                maxOpen++;
                minOpen--;
            } else {
                if (s.charAt(i) == '(') {
                    maxOpen++;
                    minOpen++;
                } else {
                    maxOpen--;
                    minOpen--;
                }
            }

            if (maxOpen < 0) return false;
            minOpen = Math.max(minOpen, 0);
        }

        return minOpen == 0;
    }
}