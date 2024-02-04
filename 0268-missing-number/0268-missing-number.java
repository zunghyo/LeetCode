class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < length; i++) {
            if(i != nums[i]) {
                return i;
            }
        }
        
        return length;
    }
}