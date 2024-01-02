class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int i = s.length() -1;
        
        while(i >= 0) {
            if(s.charAt(i) != ' ') {
                result++;
            } else if (result > 0){
                break;
            }
            i--;
        }
        
        return result;
    }
}