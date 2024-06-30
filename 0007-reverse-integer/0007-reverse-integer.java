class Solution {
    public int reverse(int x) {
        long reversedX = 0;
        
        while(x != 0) {
            reversedX = (reversedX * 10) + (x % 10);
            x = x / 10;
        }
        
        return (reversedX < Integer.MIN_VALUE || reversedX > Integer.MAX_VALUE) ? 0 : (int) reversedX;
    }
}