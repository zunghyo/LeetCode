import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1;
        
        while(mid <= high) {
            switch(nums[mid]) {
                case 0:
                    int tmp1 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = tmp1;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int tmp2 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = tmp2;
                    high--;
                    break;
            }
        }
    }
}