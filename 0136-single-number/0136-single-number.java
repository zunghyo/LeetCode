class Solution {
    public int singleNumber(int[] nums) {
     
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        for(int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        
        for(int key : numsMap.keySet()) {
            if(numsMap.get(key) == 1) {
                return key;
            }
        }
        
        throw new IllegalArgumentException("No single number found");
    }
}