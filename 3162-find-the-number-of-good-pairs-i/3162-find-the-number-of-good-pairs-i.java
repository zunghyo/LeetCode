class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int totalCount = 0;
        for (int value : nums2) {
            int temp = value * k;
            totalCount += countDivisibles(nums1, temp);
        }

        return totalCount;
    }
    
    private static int countDivisibles(int[] nums1, int divisor) {
        int count = 0;
        for (int i : nums1) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }
}