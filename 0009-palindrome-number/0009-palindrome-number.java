class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        return String.valueOf(x).equals(reversedStr);
    }
}